package dataStreams_Serialaztion_4__05_9_2024;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("E:\\Test.txt");
            ObjectInputStream oos = new ObjectInputStream(fis);
            Employee emp = (Employee) oos.readObject();

            System.out.println("Deserialization Employee");
            System.out.println(emp.eName);
            System.out.println(emp.eID);
            oos.close();
            fis.close();
        } catch (IOException | ClassNotFoundException f) {
            f.printStackTrace();

        }

    }
}
