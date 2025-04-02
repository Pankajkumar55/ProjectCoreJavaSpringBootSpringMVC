package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorMgmtService;

@Component
public class JPARepositoryRunner implements CommandLineRunner {
  @Autowired
  private IDoctorMgmtService  docService;

  @Override
  public void run(String... args) throws Exception {
    /*    try {
      String msg=docService.removeAllDoctorsInBatch(List.of(302,357,405,567,890,307));
      System.out.println(msg);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    */    
    /* try {
        Doctor doc=new Doctor();
        doc.setSpecialization("cardio");  doc.setQlfy("MD");
       //use  service
        List<Doctor>  list=docService.findDcotorsByExampleData(doc, true, "dname");
        list.forEach(System.out::println);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    */    
    
    /*   try {
        Doctor doctor=docService.showDoctorById(452);
        System.out.println(doctor);
    }
      catch(Exception e) {
        e.printStackTrace();
      }*/
    
    try {
      Doctor  doctor=docService.fetchDoctorById(452);
      /* System.out.println("class name of the object::"+doctor.getClass());
      System.out.println("dcotor  id::"+doctor.getDid());
      */ /*System.out.println("get doctor name ::"+doctor.getDname());
      System.out.println("get doctor specialization::"+doctor.getSpecialization());
      */    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }//run(-)

}//class
