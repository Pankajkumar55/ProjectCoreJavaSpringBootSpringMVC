package com.nt.service;

import java.util.List;

import com.nt.entity.Faculty;
import com.nt.entity.Student;

public interface ICollegeMgmtService {
  public  String    registerDetailsUsingFacultiesInfo(List<Faculty> list);
  public   String   registerDetailsUsingStudentsInfo(List<Student> list);
  public  List<Faculty>  loadFacultiesAndThierStudents();
  public  List<Student> loadStudentsAndTheirFaculties();
  public  String    removeStudentsFromFaculty(int fid,int sid1,int sid2);
}
