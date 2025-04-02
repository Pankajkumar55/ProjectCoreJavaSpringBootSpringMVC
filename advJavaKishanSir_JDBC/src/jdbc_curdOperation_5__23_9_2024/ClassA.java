package jdbc_curdOperation_5__23_9_2024;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Scanner;

public class ClassA {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ClassA a = new ClassA();
        // a.conect();
        // a.meth1();
        // a.meth2();
        // a.meth3();
        a.meth4();
        System.out.println("PROGRAM END");
    }

    Connection conect() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "mydb4pm", "TIGER");
            System.out.println("Database connection succesfully !!!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
    }

    void meth1() {
        System.out.println("Reteriving the data from the database ");
        Connection con = conect();
        try {
            Statement stm = con.createStatement();
            System.out.println("Enter your Table name : ");

            ResultSet rs = stm.executeQuery("select * from " + sc.next());
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
                        + " " + rs.getString(5));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void meth2() {
        System.out.println("Inserting tha data into Table");
        Connection con = conect();
        try {
            Statement stm = con.createStatement();
            System.out.println("Enter empId : ");
            int id = sc.nextInt();
            System.out.println("Enter first Name : ");
            String fName = sc.next();

            System.out.println("Enter your second Name : ");
            String sName = sc.next();
            System.out.println("Enter your salary : ");
            int sal = sc.nextInt();
            System.out.println("Enter your Addres : ");
            String add = sc.next();
            int rowCount = stm.executeUpdate("insert into employee values('" + id + "','" + fName + "', '" + sName
                    + "'," + sal + ",'" + add + "')");
            if (rowCount != 0) {
                System.out.println(rowCount + " Query Update");
                System.out.println("Data Inserted \nDo you want to see the data YES/NO ");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("yes"))
                    meth1();
                else
                    return;
            } else {
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println("EmpId Duplicate not allowed");
        }

    }

    void meth3() {
        System.out.println("Retrive a specific data");
        Connection con = conect();
        try {
            Statement stm = con.createStatement();
            System.out.println("Enter a empId which data you want to retrive");
            int id = sc.nextInt();
            ResultSet rs = stm.executeQuery("select * from employee where eId='" + id + "' ");
            if (rs.next())
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(id)
                        + " " + rs.getString(5));
            else {
                System.out.println("Please Check your id !!! \n Your id is not correct ");
            }

        } catch (SQLException e) {
            System.out.println("Please enter a Int data");

        }
    }

    void meth4() {
        System.out.println("Update a specific row");
        Connection con = conect();
        try {
            Statement s = con.createStatement();
            System.out.println("Enter emp sallary");
            int sal = sc.nextInt();
            System.out.println("Enter empId");
            String id = sc.next();

            int rowCount = s.executeUpdate("update employee set esal=" + sal + " where eid ='" + id + "'");
            if (rowCount != 0) {
                System.out.println(rowCount + " Query update");
                System.out.println("if you want to see the all data \nYes/No");
                String ss = sc.next();
                if (ss.equalsIgnoreCase("yes"))
                    meth1();
                else
                    return;
            } else
                System.out.println("Check your empId");

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    void meth5() {
        System.out.println("Delter a specific data");
        Connection con = conect();
        try {
            Statement stm = con.createStatement();
            System.out.println("Enter a empId which data you want to delete");
            int id = sc.nextInt();
            int rowCount = stm.executeUpdate("delete from employee where eid='" + id + "' ");
            if (rowCount != 0) {

                System.out.println(rowCount + " Query delete\nIf you want to see the all data YES/NO ");
                String ss = sc.next();
                if (ss.equalsIgnoreCase("yes"))
                    meth1();
                else {
                    System.out.println("Bye Bye !!");
                    return;
                }

            } else {
                System.out.println(id + " is not avilabe in Database ");
            }

        } catch (SQLException e) {
            System.out.println("Please enter a Integer data");

        }
    }
}
