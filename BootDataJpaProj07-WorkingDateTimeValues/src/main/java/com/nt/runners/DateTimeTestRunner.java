package com.nt.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.JobSeeker;
import com.nt.service.IJobSeekerMgmtService;

@Component
public class DateTimeTestRunner implements CommandLineRunner {
  @Autowired
  private  IJobSeekerMgmtService  jsService;

  @Override
  public void run(String... args) throws Exception {
    /*try {
    //prepare  JobSeeker object
    JobSeeker js=new JobSeeker("mahesh","mumbai",
                                                       LocalDateTime.of(1996,10,20,15,30), 
                                                       LocalTime.of(18,40),
                                                       LocalDate.of(2023,10,23));
      String msg=jsService.registerJobSeeker(js);
      System.out.println(msg);
    }
    catch(Exception e) {
    e.printStackTrace();
    
    }*/
    
    try {
      double  age=jsService.showJsAgeById(1);
      System.out.println("Job Seeker  age ::"+age);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    
    
    /*try {
        jsService.showAllJobSeeker().forEach(System.out::println);
    }
    catch(Exception e) {
      e.printStackTrace();
    }*/
    
  }

}
