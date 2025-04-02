package connectionPooling_EnterNumber__7_10_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPooling {
    String dBurl, dBuserName, dBPassword;

    Vector<Connection> v = new Vector<Connection>();

    public ConnectionPooling(String dBurl, String dbUserName, String dBPassword) {
        this.dBurl = dBurl;
        this.dBuserName = dbUserName;
        this.dBPassword = dBPassword;

    }

    void con_Initialization() {
        System.out.println("Creating 's' Connection Objects\n");
        System.out.println("Connection pool is empty");

        while (v.size() < 5) {
            try {
                Connection con = DriverManager.getConnection(dBurl, dBuserName, dBPassword);
                v.addElement(con);

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        for (Object o : v)
            System.out.println(o);
        System.out.println("\n '5' Connection Objects are present in the pool");
    }

    Connection con_Acquisition() {
        System.out.println("Assining a Connection Object");
        Connection con = v.elementAt(0);
        v.remove(0);
        return con;

    }

    void con_Return(Connection con) {
        System.out.println("Retruning a Connection Object");
        v.addElement(con);
        for (Object o : v)
            System.out.println(o);
        System.out.println();
    }
}
