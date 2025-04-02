package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer>  {
    // public  List<Doctor>  findBySpecializationEquals(String  speciality);
  //public  List<Doctor>  readBySpecializationEquals(String  speciality);
  public  List<Doctor>  getBySpecializationEquals(String  speciality);
  public  List<Doctor>  findBySpecializationIs(String  speciality);
  public  Iterable<Doctor>  findBySpecialization(String  speciality);
  
  public Iterable<Doctor> findByDnameStartingWith(String letters);
  public Iterable<Doctor> findByDnameEndingWith(String letters);
  public  Iterable<Doctor>  findByDnameContaining(String letters);
    public  Iterable<Doctor>   findByDnameLike(String letters);
    
    public Iterable<Doctor>  findByIncomeBetween(double start,double end);
    public   Iterable<Doctor>  findByIncomeGreaterThanAndIncomeLessThan(double start,double end);
    public  Iterable<Doctor>  findBySpecializationEqualsIgnoreCase(String  speciality);
    public  Iterable<Doctor>  findBySpecializationEqualsIgnoreCaseOrderByDnameAsc(String  speciality);
    
    
  
  
     
}
