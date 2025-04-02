package byteStreams_1__03_9_2024;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ClassA {

	void fileOperations1() throws IOException {
		System.out.println("Reading the data from a file");
		FileInputStream fis = new FileInputStream("E:\\IOtestingFolder\\file2.txt");
		System.out.println("Connection created");

		int i;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);

		}
		fis.close();
		System.out.println("\nData recived\n");

	}

	void fileOperation2() throws Exception {
		System.out.println("Writing the data into a file");
		FileOutputStream fos = new FileOutputStream("E:\\IOtestingFolder\\File.txt", true);
		System.out.println("Connection created");
		String msg = "my  Name is pankaj  kumar   .";
		byte arr[] = msg.getBytes();
		fos.write(arr);
		System.out.println("Data Entered ");
		fos.close();

	}

	void fileOperation3() throws Exception {
		// Copying an file

		System.out.println("Copying the data into a file");
		FileInputStream fis = new FileInputStream("E:\\Test.txt");
		FileOutputStream fos = new FileOutputStream("E:\\IOtestingFolder\\File1.txt");
		System.out.println("Conection created");

		int i;
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}
		fis.close();
		fos.close();
	}

	void fileOperation4() throws Exception {
		// Copying an image

		System.out.println("Copying the data into a file");
		FileInputStream fis = new FileInputStream("E:\\chandan.jpg");
		FileOutputStream fos = new FileOutputStream("E:\\IOtestingFolder\\chandan");
		System.out.println("Conection created");

		/*
		  int i; while ((i = fis.read()) != -1) { fos.write(i); } fis.close();
		  fos.close();
		*/

		fos.write(fis.read());
		fis.close();
		fos.close();

	}

	public static void main(String[] args) throws Exception {
		ClassA aobj = new ClassA();
		// aobj.fileOperations1();
		aobj.fileOperation2();
//		aobj.fileOperation3();
		// aobj.fileOperation4();

	}

}
