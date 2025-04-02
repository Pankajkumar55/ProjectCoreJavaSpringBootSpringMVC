package com.nt.runners;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.service.IOToMOperationsMgmtService;

@Component
public class OneToManyTestRunner implements CommandLineRunner {
  @Autowired
  private IOToMOperationsMgmtService otomService;

  @Override
  public void run(String... args) throws Exception {
    /*    try {
       List<Object[]> list=otomService.showPersonAndHisPhoneNumbers();
       list.forEach(row->{
         System.out.println(Arrays.toString(row));
       });
     }
     catch(Exception e) {
       e.printStackTrace();
     }
    */
    try {
      List<Object[]>  list=otomService.showPhoneNumbersAndPerson();
      list.forEach(row->{
        System.out.println(Arrays.toString(row));
      });
    }//try
    catch(Exception e) {
      e.printStackTrace();
    }
  }
   
}
