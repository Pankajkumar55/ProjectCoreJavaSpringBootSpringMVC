package jdbc_transaction_management__7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class SavepointDemo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##pankaj",
                    "pankaj");

            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();


            statement.executeQuery("update student set name ='pprasad' where id=1");
            Savepoint savepoint = connection.setSavepoint();


            statement.executeUpdate("delete from student where id=2");
            connection.rollback(savepoint);


            statement.executeUpdate("insert into student values('rajan',6)");
            connection.commit();


        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
