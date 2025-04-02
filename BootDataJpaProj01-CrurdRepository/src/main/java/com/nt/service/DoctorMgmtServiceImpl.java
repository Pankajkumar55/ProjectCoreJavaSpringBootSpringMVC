//Sevice impl class
package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.exception.DoctorNotFoundException;
import com.nt.repository.IDoctorRepository;

@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
  @Autowired
  private  IDoctorRepository  doctorRepo;  //Injects the dynamically InMemory Proxy class obj 

  @Override
  public String registerDoctor(Doctor doctor) {
    /*System.out.println("Repository obj class name(InMemory Proxy class name)::"+doctorRepo.getClass().getName());
    System.out.println("List of  implemented interfaces::"+Arrays.toString(doctorRepo.getClass().getInterfaces()));
    System.out.println("List  of methods ::"+Arrays.toString(doctorRepo.getClass().getDeclaredMethods()));*/
    
      //save the object  (insert the record)
    Doctor savedDoctor=doctorRepo.save(doctor);
    //get  the generated id value
    int idVal=savedDoctor.getDid();
    return  "Doctor obj is saved with id Value:: "+idVal;
  }
  
  @Override
  public long showDoctorsCount() {
     long count=doctorRepo.count();
    return count;
  }

  /* @Override
  public String registerDoctorsAsGroup(Iterable<Doctor> list) {
    //save objects
    Iterable<Doctor>  savedList=doctorRepo.saveAll(list);
    //get  saved objs count
    List<Doctor>  savedList1=(List<Doctor>)savedList;
    int count=savedList1.size();
    //get  only id values  from the savedList
    List<Integer>  ids=new ArrayList<>();
    savedList1.forEach(doc->{
      ids.add(doc.getDid());
    });
    return  count+" no.of doctors are saved with id values::"+ids;
  }
  */ 
  
  @Override
  public String registerDoctorsAsGroup(Iterable<Doctor> list) {
   
  //save objects
    Iterable<Doctor>  savedList=doctorRepo.saveAll(list);
    //  collect only   id  values from the savedList of objects
   List<Integer>  ids=StreamSupport.stream(savedList.spliterator(), false).map(Doctor::getDid).collect(Collectors.toList());
   return  ids.size()+" no.of doctors are saved with id values::"+ids;
   }
  
  @Override
  public String checkDoctorAvailabilityById(int id) {
    boolean  flag=doctorRepo.existsById(id);
    return flag?id+" id Value Doctor found": "Doctor not found";
  }
  
  @Override
  public Iterable<Doctor> findAllDoctors() {
    return doctorRepo.findAll();
  }
  
  @Override
  public Iterable<Doctor> findAllDoctorsByIds(Iterable<Integer> ids) {
       return  doctorRepo.findAllById(ids);
    
  }
  
  /*@Override
  public Doctor showDoctorById(int id) {
      Optional<Doctor>  opt=doctorRepo.findById(id);
      if(opt.isPresent()) {
        //get the Object
        Doctor doc=opt.get();
        return doc;
      }
      throw new IllegalArgumentException("Invalid Doctor Id");
  }
  */
  
  /*@Override
  public Doctor showDoctorById(int id) {
      return  doctorRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid id"));  
  
  }
  */
  
  /*@Override
  public Doctor showDoctorById(int id) {
    return  doctorRepo.findById(id).orElseThrow(()-> new DoctorNotFoundException("invalid id"));
  }*/
  

  @Override
  public Doctor showDoctorById(int id) {
       return  doctorRepo.findById(id).orElse(new Doctor(1111,"abc","MBBS",9999L,888888L,"Duty-Doctor"));
  }
  
  @Override
  public String registerOrUpdateDoctor(Doctor doctor) {
        doctorRepo.save(doctor);
        return "Dcotor is  saved /updated";
  }

  @Override
  public String fetchDoctorById(int id) {
     //Load obj
    Optional<Doctor>  opt=doctorRepo.findById(id);
    if(opt.isPresent()) {
      Doctor doc=opt.get();
      return  id+"  doctor id details are"+doc;
    }
    else {
        return id+" Doctor is not found";
    }
           
  }
  
  @Override
  public Optional<Doctor> getDoctorById(int id) {
    Optional<Doctor> opt=doctorRepo.findById(id);
    if(opt.isEmpty())
           return Optional.empty();
    else
      return opt;
  }

  @Override
  public String updateDoctorDetails(int id, String newQlfy, long newMobileNo) {
     Optional<Doctor>  opt=doctorRepo.findById(id);
     if(opt.isPresent()) {
       //get object
       Doctor doc=opt.get();
       // set new data
       doc.setQlfy(newQlfy); doc.setMobileNo(newMobileNo);
        doctorRepo.save(doc);
       return  "Doctor  Details are updated";
     }
    return "Doctor is not found for updation";
  }
  
  @Override
  public String removeAllDoctors() {
     //get  the count of records
     long count=doctorRepo.count();
     //delete  all the records
      doctorRepo.deleteAll();
    return   count+"  no.of  Doctors are deleted";
  }
  
  @Override
  public String removeDoctorsByIds(Iterable<Integer> ids) {
    // get Docotrs By Ids
    Iterable<Doctor>  list=doctorRepo.findAllById(ids);
    long count=StreamSupport.stream(list.spliterator(), false).count();
        //detele doctors by ids
       doctorRepo.deleteAllById(ids);
    return count+" no.of doctors are deleted";
  }
  
  @Override
  public String removeDoctorById(int id) {
    //Load the object
    Optional<Doctor>  opt=doctorRepo.findById(id);
    if(opt.isPresent()) {
        doctorRepo.deleteById(id);
        return  id+"  id Doctor is deleted";
    }
    return id+" id  Doctor not found for deletion";
  }
  
  
  
  
      
}