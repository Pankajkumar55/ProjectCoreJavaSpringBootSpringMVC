package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorMgmtService;

@Component
public class PagingAndSortingRepositoryRunner implements CommandLineRunner {
  @Autowired
  private IDoctorMgmtService  docService;

  @Override
  public void run(String... args) throws Exception {
    /*   try {
    //use docSErvice
    docService.showAllDoctorsBySorting(true,"dname","specialization").forEach(System.out::println);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    */
    /*try {
      Page<Doctor> page= docService.showAllDoctorsByPageNo(4, 3);
      System.out.println("requested page records are ::");
      List<Doctor> list=page.getContent();
      list.forEach(System.out::println);
      System.out.println("----------------------");
      System.out.println("requested page number ::"+(page.getNumber()+1));
      System.out.println("Total no.of pages ::"+page.getTotalPages());
      System.out.println(" Is it the first page ::"+page.isFirst());
      System.out.println("Is it the Last Page ::"+page.isLast());
      System.out.println("requested  page size::"+page.getSize());
      System.out.println(" no.of  records in requested page:: "+page.getNumberOfElements());
    }
    catch(Exception e) {
      e.printStackTrace();
    }*/
    
    /*try {
      Page<Doctor>  page=docService.showAllDoctorsByPageNoAsSorted(0, 4, false, "specialization");
      page.forEach(System.out::println);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    */
    try {
      docService.showAllDoctorsInPagination(4);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    
  }

}
