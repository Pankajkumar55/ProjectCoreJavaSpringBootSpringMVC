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
    //save the object
      //parent obj
    Person per=new Person("raja","hyd");
    //child objs
    PhoneNumber ph1=new PhoneNumber("office", 899999999L, "jio");
    PhoneNumber ph2=new PhoneNumber("personal", 799911999L, "vi");
    // Link  parent to  childs (Many to One)
    ph1.setPerson(per);  ph2.setPerson(per);
    //Link chids with parnet (one to many)
    per.setPhones(Set.of(ph1,ph2));
    //invoke the method
    try {
      String msg=otomService.registerPersonWithPhoneNumbers(per);
      System.out.println(msg);
    }
    catch(Exception e) {
      e.printStackTrace();
    }

     //Child to parent object saving
    //parent obj
    Person per1=new Person("suman","delhi");
    //child objs
    PhoneNumber ph11=new PhoneNumber("office", 79999989L, "jio");
    PhoneNumber ph22=new PhoneNumber("personal", 799911199L, "vi");
    //link parent with childs
    ph11.setPerson(per1); ph22.setPerson(per1);
    //link  childs with parent
    Set<PhoneNumber>  phonesSet=new HashSet<PhoneNumber>();
    phonesSet.add(ph11); phonesSet.add(ph22);
    per1.setPhones(phonesSet);
    //parent  List<PhoneNumber> collection
    List<PhoneNumber>  list=Arrays.asList(ph11,ph22);
    //invoke the b.method
    try {
      String  msg=otomService.registerPhoneNumberWithPerson(list);
      System.out.println(msg);
    }
    catch(Exception e) {
      e.printStackTrace();
    }

    /* try {
      List<Person>  list=otomService.loadPersonAndHisPhoneNumbers();
     list.forEach(per->{
        System.out.println("Parent ::"+per);
    
       Set<PhoneNumber>  phonesSet=per.getPhones();
        phonesSet.forEach(ph->{
          System.out.println("child::"+ph);
        });
        System.out.println("------------------");
      }); 
    }//try
    catch(Exception e) {
      e.printStackTrace();
    }*/
    
    /*  try {
      List<PhoneNumber>  list=otomService.loadPhonesWithPerson();
     list.forEach(ph->{
        System.out.println("child ::"+ph);
        //get Associated parent
        Person per=ph.getPerson();
        System.out.println("parent ::"+per);
      });
    }//try
    catch(Exception e) {
      e.printStackTrace();
    }
    */  
    /*try {
      String msg=otomService.removePersonAndHisPhones(180);
      System.out.println(msg);
    }
    catch(Exception e) {
      e.printStackTrace();
    }*/
    /*  try {
      String msg=otomService.removePhonesOfAPerson(202);
      System.out.println(msg);
    }
    catch(Exception e) {
      e.printStackTrace();
    }*/
    
    /*    try {
      PhoneNumber ph=new PhoneNumber("office", 9899999L,"airtel");
       String msg=otomService.addNewPhoneNumberToAPerson(202, ph);
       System.out.println(msg);
    }//try
    catch(Exception e) {
      e.printStackTrace();
    }
    */
    
    /* try {
      String msg=otomService.removePhoneNumbersAndPerson(202);
      System.out.println(msg);
    }
    catch(Exception e) {
      e.printStackTrace();
    }*/
  
  }
  
}
