package com.nt.runners;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Faculty;
import com.nt.entity.Student;
import com.nt.service.ICollegeMgmtService;

@Component
public class ManyToManyTestRunner implements CommandLineRunner {
  @Autowired
  private  ICollegeMgmtService  collegeService;
 

  @Override
  public void run(String... args) throws Exception {
    /*try {
     Student st1=new Student("raja","hyd","CSE");
     Student st2=new Student("ramesh","hyd","IT");
     Student st3=new Student("anil","hyd","ECE");
     
     
     Faculty fc1=new Faculty("kiran","hyd","JAVA");
     Faculty fc2=new Faculty("mahesg","hyd","UI");
     //assign  students to the faculties
     fc1.getStudents().add(st1);fc1.getStudents().add(st2);
     fc2.getStudents().add(st1);fc2.getStudents().add(st2);fc2.getStudents().add(st3);
     //assign  faculties to  the students
     st1.getFaculties().add(fc1); st1.getFaculties().add(fc2);
     st2.getFaculties().add(fc1); st2.getFaculties().add(fc2);
     st3.getFaculties().add(fc2);
     
     //invoke the method
     String msg=collegeService.registerDetailsUsingFacultiesInfo(Arrays.asList(fc1,fc2));
     System.out.println(msg);
     
    }
    catch(Exception e) {
    e.printStackTrace();
    }
    */
    /*    try {
      Student st1=new Student("raja1","hyd","CSE");
      Student st2=new Student("ramesh1","hyd","IT");
      Student st3=new Student("anil1","hyd","ECE");
      
      
      Faculty fc1=new Faculty("kiran1","hyd","JAVA");
      Faculty fc2=new Faculty("mahesg1","hyd","UI");
      //assign  students to faculties
      fc1.getStudents().add(st1);  fc1.getStudents().add(st2);
     fc2.getStudents().add(st3); fc2.getStudents().add(st1);
     // add faculties to the students
     st1.getFaculties().add(fc1); st1.getFaculties().add(fc2);
     st2.getFaculties().add(fc1);
     st3.getFaculties().add(fc2);
     //invoke the service method
     String msg=collegeService.registerDetailsUsingStudentsInfo(Arrays.asList(st1,st2,st3));
     System.out.println(msg);
     
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    */
    
    /*try {
      collegeService.loadFacultiesAndThierStudents().forEach(fc->{
        System.out.println("Parent ::"+fc);
        Set<Student>  studs=fc.getStudents();
        studs.forEach(st->{
          System.out.println("child:"+st);
        });
        System.out.println("-----------------------------");
      });
    }//try
    catch(Exception e) {
      e.printStackTrace();
    }*/
    
    /*   try {
      collegeService.loadStudentsAndTheirFaculties().forEach(st->{
          System.out.println("Child::"+st);
          Set<Faculty>  faculties=st.getFaculties();
          faculties.forEach(fc->{
            System.out.println("parent ::"+fc);
          });
          System.out.println("-----------------------");
      });
      
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    */
    
    try {
      String msg=collegeService.removeStudentsFromFaculty(42, 140,141);
      System.out.println(msg);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    
  }//run(-)
 }//class
