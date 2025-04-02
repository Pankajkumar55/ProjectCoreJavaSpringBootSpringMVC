package com.map.map__6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
If we run this file for first time we will first compile then run,
and second time if we update anything in file then we will only run this file. we will not compile for second time. 
*/

public class Properties_ChildClassOfHashTable__9 {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		/*
		If we want take any other extension instead of .properties we can take but we take always .properties because out convention
		*/
		FileInputStream fis = new FileInputStream(
				"E:\\NatrajSirSpringBoot&VankateshMansaniAdvJava\\DurgaSir_CollectionFramework\\src\\com\\map\\map__6\\abc.properties");
		p.load(fis); // This is load all data from abc.properties file
		System.out.println(p);
		String property = p.getProperty("venki"); // This is search data based on this key
		System.out.println(property);
		p.setProperty("munnaKey", "munnaValue"); // This is new key and value
		FileOutputStream fos = new FileOutputStream(
				"E:\\NatrajSirSpringBoot&VankateshMansaniAdvJava\\DurgaSir_CollectionFramework\\src\\com\\map\\map__6\\abc.properties");
		p.store(fos, "This is updated by Pankaj kumar"); // Take fos Stream and write in file with comment

	}
}
