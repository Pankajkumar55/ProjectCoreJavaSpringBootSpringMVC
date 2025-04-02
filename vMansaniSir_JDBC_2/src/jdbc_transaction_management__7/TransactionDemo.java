package jdbc_transaction_management__7;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TransactionDemo {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##pankaj",
                    "pankaj");
            System.out.println(connection.getAutoCommit());
            connection.setAutoCommit(false); // In JDBC By Default setAutoCommit is true
            System.out.println(connection.getAutoCommit());
            Statement stm = connection.createStatement();
            stm.execute("insert into student values('raj',4)");
            connection.commit();
            System.out.println("one record insert succesfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
