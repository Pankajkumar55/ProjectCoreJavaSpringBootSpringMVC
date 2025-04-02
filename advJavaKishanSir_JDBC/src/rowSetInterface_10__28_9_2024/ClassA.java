package rowSetInterface_10__28_9_2024;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class ClassA {
    String driver = "jdbc.oracle.thin.OracleDriver";
    String dbUrl = "jdbc:oracle:thin:@localhost:1521:orc;";
    String dbName = "mydb4pm";
    String dbPass = "tiger";

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
    }

    void meth1() {
        System.out.println("Implementing RowSet Interface");
        try {

            RowSetFactory rsf = RowSetProvider.newFactory();
            JdbcRowSet jrs = rsf.createJdbcRowSet();

            jrs.setUrl(dbUrl);
            jrs.setUsername(dbName);
            jrs.setPassword(dbPass);
            jrs.setCommand("select * from employee");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
