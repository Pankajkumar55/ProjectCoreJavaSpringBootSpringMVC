//LOBTestRunner.java
package com.nt.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeeker;
import com.nt.service.IMarriageSeekerMgmtService;

//@Component
public class LOBTestRunner implements CommandLineRunner {
  @Autowired
  private IMarriageSeekerMgmtService  msService;

  @Override
  public void run(String... args) throws Exception {
    try {
    // use Scanner to read inputs
     Scanner sc=new Scanner(System.in);
     System.out.println("enter  name ::");
     String name=sc.next();
     System.out.println("enter  addrs ::");
      String addrs=sc.next();
      System.out.println(" is the person indian?");
      boolean isIndian=sc.nextBoolean();
      System.out.println("Enter path of the photo file::");
      String photoPath=sc.next().trim();
      System.out.println("Enter path of the biodata file::");
      String bioDataPath=sc.next();
      
      //create  Streams representing   photo file and  boi data  file  and get their content as  byte[] or char[]
      FileInputStream  fis=new FileInputStream(photoPath);
       byte[] photoContent=fis.readAllBytes();
       
       File  file=new File(bioDataPath);
       int length=(int) file.length();
       FileReader  reader=new  FileReader(file);
        char []  bioDataContent=new char[length];
       reader.read(bioDataContent);
       
       //create  Entity class obj
       MarriageSeeker  seeker=new MarriageSeeker(name,addrs,isIndian,photoContent,bioDataContent);
       // invoke  the service class method
       String msg=msService.registerMarriageSeeker(seeker);
       System.out.println(msg);
    }
    catch(Exception  e) {
      e.printStackTrace();
    }
    
  }
}
