//LOBTestRunner1.java
package com.nt.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.MarriageSeeker;
import com.nt.service.IMarriageSeekerMgmtService;

@Component
public class LOBTestRunner1 implements CommandLineRunner {
  @Autowired
  private IMarriageSeekerMgmtService  msService;

  @Override
  public void run(String... args) throws Exception {
    try {
    // use Scanner to read inputs
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter  Marriage Seeker Id ::");
     int mid=sc.nextInt();
     
    //invoke the service method
     MarriageSeeker  ms=msService.getMarriageSeekerById(mid);
       String name=ms.getName();  String addrs=ms.getAddrs();
       boolean isIndian=ms.isIndian();  
       byte[] photoData=ms.getPhoto();  char[]  boiData=ms.getBoidata();
       
       System.out.println("Info is :"+mid+" "+name+" "+addrs+" "+isIndian);
       //write  byte[]  form  of photo content  to  file
       FileOutputStream  fos=new FileOutputStream("retrive_photo.jfif");
       fos.write(photoData); fos.flush(); fos.close();
       //write char[]  from   of  boidata conent  to file
       FileWriter  writer=new FileWriter("retrieve_boidata.txt");
       writer.write(boiData); writer.flush(); writer.close();
  }//try
    catch(Exception e) {
      e.printStackTrace();
    }
    
  }//run()
}//class
  
