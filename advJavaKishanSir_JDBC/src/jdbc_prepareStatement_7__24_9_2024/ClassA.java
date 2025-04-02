package jdbc_prepareStatement_7__24_9_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class ClassA {
    Scanner sc = new Scanner(System.in);
    String driver = "oracle.jdbc.OracleDriver";
    String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
    String dbUsername = "mydb4pm";
    String dbPassword = "tiger";

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.operations();
        System.out.println("bye bye");
    }

    Connection connect() {
        Connection con = null;

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            System.out.println("Database connected");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    void operations() {
        Connection con = connect();

        try {
            PreparedStatement pstm1 = con.prepareStatement("insert into patient values (?,?,?,?)");

            while (true) {
                System.out.println("-----Welcome to PatientDatabase-----");
                System.out.println(
                        "1. Add patient \n2. patient details \n3. Retrive patient data \n4. update patient data \n5. delete patient details \n6. exit");
                System.out.println("enter your choice");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Adding patient details");
                        System.out.println("enter patient id");
                        String id = sc.next();
                        System.out.println("enter patient name");
                        String name = sc.next();
                        System.out.println("enter patient age");
                        int age = sc.nextInt();
                        System.out.println("enter mobile number");
                        long number = sc.nextLong();

                        pstm1.setString(1, id);
                        pstm1.setString(2, name);
                        pstm1.setInt(3, age);
                        pstm1.setLong(4, number);
                        int rowCount = pstm1.executeUpdate();
                        if (rowCount > 0) {
                            System.out.println(rowCount + " data inserted");

                        } else {
                            System.out.println("data not inserted");
                        }
                        break;

                    case 2:
                        System.out.println("viewing patient details");
                        PreparedStatement pstm2 = con.prepareStatement("select * from patient");
                        ResultSet rs = pstm2.executeQuery();
                        while (rs.next()) {
                            if (rs.next()) {
                                System.out.println(
                                        rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getLong(4));
                                System.out.println("hyy");
                            } else {
                                System.out.println("data not avilable");
                            }

                        }
                        break;
                    case 3:
                        System.out.println("Reteriving a specific data");
                        System.out.println("Enter your patient ID");
                        String id1 = sc.next();
                        PreparedStatement pstm3 = con.prepareStatement("select * from patient where pid=? ");
                        pstm3.setString(1, id1);
                        ResultSet rs1 = pstm3.executeQuery();
                        if (rs1.next()) {
                            System.out.println(
                                    rs1.getString(1) + " " + rs1.getString(2) + " " + rs1.getInt(3) + " " + rs1.getLong(4));
                        } else {
                            System.out.println("Data not found");
                        }
                        break;
                    case 4:
                        System.out.println("Updating a patient data");
                        PreparedStatement pstm4 = con.prepareStatement("update patient set age='?' where pid='?'");
                        System.out.println("Enter patient id ");
                        String id3 = sc.next();
                        System.out.println("Enter your age");
                        int age4 = sc.nextInt();
                        pstm4.setString(1, id3);
                        pstm4.setInt(2, age4);

                        int rowCount4 = pstm4.executeUpdate();
                        if (rowCount4 > 0)
                            System.out.println(rowCount4 + " row updated");
                        else
                            System.out.println("No row updated");
                        break;
                    case 5:
                        System.out.println("Delete patient details");
                        PreparedStatement pstm5 = con.prepareStatement("delete from patient where pid=?");
                        System.out.println("Enter your patient id");
                        String id5 = sc.next();
                        pstm5.setString(1, id5);
                        int rowCount5 = pstm5.executeUpdate();
                        if (rowCount5 > 0)
                            System.out.println("1 row deleted");
                        else
                            System.out.println("your id doesn't exist in table");
                        break;

                    case 6:

                        return;
                    default:
                        System.out.println("You are enter a invalid number");
                }
            }
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Id is uniq");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
