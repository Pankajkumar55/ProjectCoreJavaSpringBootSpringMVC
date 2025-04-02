package data_streams_3__05_9_2024;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ClassA {

	void fileOperations() throws Exception {
		System.out.println("Implementing DataInputStream\n");

		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\Fileinput\\TestFile"));
		System.out.println("conection created");

		dos.writeInt(1000);
		dos.writeChar('A');
		dos.writeBoolean(true);
		dos.writeInt(2000);

		System.out.println("Data Entered\n");
		dos.close();

		DataInputStream dis = new DataInputStream(new FileInputStream("E:\\Fileinput\\TestFile"));
		System.out.println("Conection Created\n");

		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt() + "\n");

		System.out.println("Data Retrived");
	}

	public static void main(String[] args) throws Exception {
		ClassA aobj = new ClassA();
		aobj.fileOperations();

	}
}
