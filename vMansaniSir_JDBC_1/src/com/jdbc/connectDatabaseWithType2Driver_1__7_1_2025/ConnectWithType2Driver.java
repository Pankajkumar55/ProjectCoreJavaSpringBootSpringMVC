package com.jdbc.connectDatabaseWithType2Driver_1__7_1_2025;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectWithType2Driver {
    public static void main(String[] args) {
        try {

            System.out.println("Driver loading");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded succesfully");
            System.out.println("Connection database");

            //
            DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "pankaj");

            System.out.println("Database connected succesfully");

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

    }
}
