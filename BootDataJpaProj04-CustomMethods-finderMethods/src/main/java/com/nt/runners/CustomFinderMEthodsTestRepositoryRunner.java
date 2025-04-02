package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Component
public class CustomFinderMEthodsTestRepositoryRunner implements CommandLineRunner {
  @Autowired
  private IDoctorRepository  docRepo;

  @Override
  public void run(String... args) throws Exception {
    /*List<Doctor>  list=docRepo.getBySpecializationEquals("cardio");
    list.forEach(System.out::println);
    */
    /* List<Doctor>  list=docRepo.findBySpecializationIs("cardio");
     list.forEach(System.out::println);
    */
       //docRepo.findBySpecializationIs("cardio").forEach(System.out::println);
    
       /*   docRepo.findByDnameStartingWith("n").forEach(System.out::println);
         System.out.println("------------------");
         docRepo.findByDnameEndingWith("l").forEach(System.out::println);
         System.out.println("------------------");
         docRepo.findByDnameContaining("s").forEach(System.out::println);
       */ 
    
       /*    docRepo.findByDnameLike("s%").forEach(System.out::println);
           System.out.println("----------------------");
           docRepo.findByDnameLike("%l").forEach(System.out::println);
           System.out.println("----------------------");
           docRepo.findByDnameLike("%s%").forEach(System.out::println);
       */    
    
                // docRepo.findByIncomeBetween(60000.0, 150000.0).forEach(System.out::println);
            //docRepo.findByIncomeGreaterThanAndIncomeLessThan(50000.0, 200000.0).forEach(System.out::println);
                 //docRepo.findBySpecializationEqualsIgnoreCase("cardio").forEach(System.out::println);
    docRepo.findBySpecializationEqualsIgnoreCaseOrderByDnameAsc("cardio").forEach(System.out::println);
    
                 
    
            
          
    
    
     }//run(-)

}//class
