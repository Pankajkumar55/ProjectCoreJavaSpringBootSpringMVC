package dataStreams_Serialaztion_4__05_9_2024;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {

	void fileOperations() throws IOException {
		System.out.println("Performing Serilization");

		Employee em = new Employee(); // Create instance of classA
		FileOutputStream fos = new FileOutputStream("E:\\Test.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos); // fos pass in this Constructor
		out.writeObject(em);
		System.out.println("Data saved");
		out.close();

	}

	public static void main(String[] args) throws Exception {
		SerializationClass serializationClass = new SerializationClass();
		serializationClass.fileOperations();
	}
}
