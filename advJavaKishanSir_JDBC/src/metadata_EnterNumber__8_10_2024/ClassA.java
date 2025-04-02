package metadata_EnterNumber__8_10_2024;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.sql.RowSetMetaData;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class ClassA {
    String driver = "oracle.jdbc.OracleDriver";
    String dbUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
    String dbUsername = "mydb4pm";
    String dbPassword = "tiger";

    public static void main(String[] args) {
        new ClassA().meth1();
    }

    void meth1() {
        System.out.println("Implementing MetaData in JDBC");
        String sqlQuery = "select efname, efname from employee where eid=? ";
        try {
            Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            System.out.println("Database connected succesfully /n");

            DatabaseMetaData dmdata = con.getMetaData();
            System.out.println("**********DatabaseMetadat***********");

            System.out.println("getDatabaseProductName() : " + dmdata.getDatabaseProductName());
            System.out.println("getDatabaseProductVersion() : " + dmdata.getDatabaseProductVersion());
            System.out.println("getDriverName() : " + dmdata.getDriverName());
            System.out.println("supportsStoredProcedures() : " + dmdata.supportsStoredProcedures());

            PreparedStatement pstm = con.prepareStatement(sqlQuery);
            pstm.setString(1, "101");
            ResultSet rs = pstm.executeQuery();

            ParameterMetaData pmdata = pstm.getParameterMetaData();
            System.out.println("\n******ParameterMetaData******");
            System.out.println("getParameterCount() : " + pmdata.getParameterCount());

            System.out.println("getParameterType() : " + pmdata.getParameterType(1));
            System.out.println("getParameterMode() : " + pmdata.getParameterMode(1));
            System.out.println("isNullable() : " + pmdata.isNullable(1));

            ResultSetMetaData rsmdata = rs.getMetaData();
            System.out.println("\n**********ResultSetMetaData***********");
            System.out.println("getColumnCount() : " + rsmdata.getColumnCount());
            System.out.println("getColumnName() : " + rsmdata.getColumnName(2));
            System.out.println("" + rsmdata.getColumnDisplaySize(1));
            System.out.println("isAutoIncrement() : " + rsmdata.isAutoIncrement(1));

            RowSetFactory rsf = RowSetProvider.newFactory();
            CachedRowSet crs = rsf.createCachedRowSet();
            crs.setUrl(dbUrl);
            crs.setUsername(dbUsername);
            crs.setPassword(dbPassword);
            crs.setCommand("select eid,efname,esal from employee");
            crs.execute();

            RowSetMetaData rowmetadata = (RowSetMetaData) crs.getMetaData();
            System.out.println("\n*******RowSetMetaData*********");
            System.out.println("getColumnCount() : " + rowmetadata.getColumnCount());
            System.out.println("getColumnName() : " + rowmetadata.getColumnName(2));
            System.out.println("getColumnDisplaySize() : " + rowmetadata.getColumnDisplaySize(1));
            System.out.println("isAutoIncrement() : " + rowmetadata.isAutoIncrement(2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
