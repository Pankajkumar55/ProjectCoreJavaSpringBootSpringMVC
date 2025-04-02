package com.nt.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Component
public class CustomQueryMethodsTestRunner implements CommandLineRunner {
  @Autowired
  private IDoctorRepository  docRepo;

  @Override
  public void run(String... args) throws Exception {
    /*        List<Doctor>  list=docRepo.showAllDoctors();
          list.forEach(System.out::println);
    */  
            //docRepo.showAllDoctorsBySpecializations("cardio", "ortho", "neuro").forEach(System.out::println);
    
            /*            System.out.println("Bulk Entity Query");
                   docRepo.showDoctorsByIncome(50000.0,90000.0).forEach(System.out::println);
                
                   System.out.println("=======================");
                   
                   System.out.println("Bulk  Scalar(more than 1 column) Query");
                 docRepo.showDoctorsDataByQualifications("MBBS", "MD", "MD-FRC").forEach(row->{
                   for(Object obj:row) {
                     System.out.print(obj+"  ");
                   }
                   System.out.println();
                 });
                 
                 System.out.println("=======================");
                 System.out.println("Bulk  Scalar(Only 1 column) Query");
                 docRepo.showDoctorsNameBySpecialization("cardio").forEach(System.out::println);
            */   
    
     
    /*//  Single Row  Entity Query
        Doctor doctor=docRepo.showDoctorDetailsByName("suman1");
        
        if(doctor==null)
             System.out.println("Record not found");
        else
        System.out.println("doctor details ::"+doctor);
        
     // Single Row Scalar Query (specific multiple col values)
        Object data=docRepo.showDoctorDataByName("suman1");
         if(data==null)
           System.out.println("record not found");
         else {
           Object row[]=(Object[])data;
           System.out.println("Doctor data ::"+Arrays.toString(row));
        }
    */     
        /*      // Single Row Scalar Query (specific single col values)
            Double income=docRepo.showDoctorIncomeByName("suman1");
            if(income==null)
              System.out.println("Record not found");
            else
            System.out.println("income ::"+income);
        */
         
        /*     long count=docRepo.showUniqueDoctorsCount();
             System.out.println("unique doctors count ::"+count);
        */
         
        /*Object   data=docRepo.showDoctorsAggregateData();
        Object row[]=(Object[]) data;
        System.out.println(" records count ::"+row[0]);
        System.out.println(" max income  ::"+row[1]);
        System.out.println(" min income  ::"+row[2]);
        System.out.println(" avg of all incomes  ::"+row[4]);
        System.out.println(" sum all incomes  ::"+row[3]);
        */
    
        /* int count=docRepo.updateDoctorsIncomeBySpecializations(10.0,"ortho","nuero");
         System.out.println("modified doctors count ::"+count);
        */   
          
        /* int count=docRepo.removeDoctorsByIncomeRange(60000.0, 200000.0);
         System.out.println("no.of  doctors that are removed ::"+count);
        */
    
             System.out.println("System  Date and time is::"+docRepo.showSystemDateAndTime());
    
  }//run(-)
  
  

}//class
