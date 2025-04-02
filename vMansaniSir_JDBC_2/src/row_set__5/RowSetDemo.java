package row_set__5;

import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class RowSetDemo {

    public static void main(String[] args) {
        try (JdbcRowSet jrs = new OracleJDBCRowSet()) {
            jrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
            jrs.setUsername("c##pankaj");
            jrs.setPassword("pankaj");
            jrs.setCommand("select * from student");
            jrs.execute();
            while (jrs.next()) {
                System.out.print(jrs.getString("name") + "\t");
                System.out.println(jrs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
