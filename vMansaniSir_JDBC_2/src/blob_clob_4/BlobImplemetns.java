package blob_clob_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobImplemetns {
    public static void main(String[] args) {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "c##pankaj",
                    "pankaj");
            System.out.println("Database connected succesfully");

            PreparedStatement pstm = con.prepareStatement("insert into images values(?,?)");
            pstm.setString(1, "Flower");

            FileInputStream fis = new FileInputStream("E:\\IOtestingFolder\\wallpaper.jpg");
            pstm.setBinaryStream(2, fis, fis.available());

            int count = pstm.executeUpdate();
            System.out.println(count + " record inserted succesfully");

        } catch (ClassNotFoundException | SQLException | IOException e) {

            e.printStackTrace();
        }

    }
}
