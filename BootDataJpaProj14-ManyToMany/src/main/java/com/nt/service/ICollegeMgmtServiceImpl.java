package com.nt.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Faculty;
import com.nt.entity.Student;
import com.nt.repository.IFacultyRepository;
import com.nt.repository.IStudentRepository;

@Service
public class ICollegeMgmtServiceImpl implements ICollegeMgmtService {
  @Autowired
  private IFacultyRepository  facutltyRepo;
  @Autowired
  private  IStudentRepository  studentRepo;

  @Override
  public String registerDetailsUsingFacultiesInfo(List<Faculty> list) {
     List<Faculty>  list1=facutltyRepo.saveAll(list);
     List<Integer> ids=list1.stream().map(Faculty::getFid).collect(Collectors.toList());
    return list1.size()+"  faculties and the associated students are saved with the id values ::"+ids;
  }
  
  @Override
  public String registerDetailsUsingStudentsInfo(List<Student> list) {
    List<Student>  list1=studentRepo.saveAll(list);
    List<Integer>  ids=list1.stream().map(Student::getSid).collect(Collectors.toList());
    return list1.size()+" students  and the associated faculties are  saved with id values::"+ids;
  }
  
  @Override
  public List<Faculty> loadFacultiesAndThierStudents() {
    return facutltyRepo.findAll();
  }
  
  @Override
  public List<Student> loadStudentsAndTheirFaculties() {
    return studentRepo.findAll();
  }
  
  @Override
  public String removeStudentsFromFaculty(int fid, int  sid1,int sid2) {
    //Load Parent obj (Faculty)
    Optional<Faculty>  opt=facutltyRepo.findById(fid);
    
    if(opt.isPresent()) {
      //get parent obj
       Faculty  faculty=opt.get();
       Student st1=studentRepo.findById(sid1).get();
       Student st2=studentRepo.findById(sid2).get();
       //remove faculty from studnet
       st1.getFaculties().remove(faculty);
       st2.getFaculties().remove(faculty);
       
       //remove selected from  faculty
       Set<Student> studsSet=faculty.getStudents();
       studsSet.remove(st1); studsSet.remove(st2);
       
       //faculty.setStudents(studsSet);
        facutltyRepo.save(faculty);
        return "selected students are removed from faculty"; 
    }
    return "Faculty is not found ";
  }

}
