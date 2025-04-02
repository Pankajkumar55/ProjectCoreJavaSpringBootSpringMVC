package transactionManagement_15__5_10_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class ClassA {
    String driver = "oracle.jdbc.OracleDriver";
    String DBurl = "jdbc:oracle:thin:@localhost:1521:orcl";
    String DBusername = "mydb4pm";
    String DBpassword = "tiger";

    String sqlQuery1 = "update trainseatavailability set available_seats = available_seats-1 where train_id=?"
            + "and journey_date=? and class=? and available_seats > 0";
    String sqlQuery2 = "insert into bookingDetails (Booking_id, Train_id, Customer_id, Seat_number, status) "
            + "values (?,?,?,?,?)";
    String sqlQuery3 = "select payment_status from customerpayment where customer_id = ?";
    String sqlQuery4 = "update bookingdetails set status='confirmed' where booking_id =?";

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }

    void meth1() {
        System.out.println("Implementing Transaction Management on TicketBooking \n");

        try {

            Connection con = DriverManager.getConnection(DBurl, DBusername, DBpassword);
            System.out.println("Database connected successfully");
            System.out.println("con.getAutoCommit() : " + con.getAutoCommit()); // true
            con.setAutoCommit(false);
            System.out.println("con.getAutoCommit() : " + con.getAutoCommit()); // false

            PreparedStatement pstm = con.prepareStatement(sqlQuery1);
            pstm.setString(1, "12345");
            pstm.setString(2, "2024-10-10");
            pstm.setString(3, "Sleeper");
            int rowCount = pstm.executeUpdate();

            if (rowCount == 0) {
                throw new SQLException("Seats are not available");
            }
            System.out.println("Seat is Locked");
            Savepoint sp1 = con.setSavepoint();

            // con.commit();
            // Savepoint sp2 = con.setSavepoint();

            PreparedStatement pstm1 = con.prepareStatement(sqlQuery2);
            pstm1.setString(1, "B105");
            pstm1.setString(2, "12345");
            pstm1.setString(3, "C123");
            pstm1.setInt(4, 1);
            pstm1.setString(5, "Pending Payment");
            int rowCount1 = pstm1.executeUpdate();

            if (rowCount1 == 0) {
                throw new SQLException("Booking Not Done");

            }
            System.out.println("Booking record created succesfully");
            System.out.println("waiting for payment confirmation");


            PreparedStatement pstm2 = con.prepareStatement(sqlQuery3);
            pstm2.setString(1, "C12");
            ResultSet rs2 = pstm2.executeQuery();
            String status = "Failed";

            if (rs2.next()) {
                status = rs2.getString(1);
                System.out.println("::" + rs2.getString(1));
                System.out.println("this is checking purpose");
            }

            if ("succes".equalsIgnoreCase(status)) {
                PreparedStatement pstm3 = con.prepareStatement(sqlQuery4);
                pstm3.setString(1, "B105");
                int rowCount2 = pstm3.executeUpdate();

                if (rowCount2 == 0) {
                    throw new SQLException("Update query in NOT working");

                }
                System.out.println("Transcation succes");
                con.commit();
                System.out.println("All the savepoints are released");

            } else {
                System.out.println("Payment failed");
                System.out.println("Transaction rolling back to the last savepoint");
                con.rollback();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
