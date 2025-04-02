//service Interface
package com.nt.service;

import java.util.Optional;

import com.nt.entity.Doctor;

public interface IDoctorMgmtService {
    public  String     registerDoctor(Doctor doctor);
    public    long      showDoctorsCount();
    public   String    registerDoctorsAsGroup(Iterable<Doctor> list);
    public   String    checkDoctorAvailabilityById(int id);
    public Iterable<Doctor>  findAllDoctors();
    public Iterable<Doctor>  findAllDoctorsByIds(Iterable<Integer> ids);
    public   Doctor   showDoctorById(int id);
    public   String  fetchDoctorById(int id);
    public    Optional<Doctor>  getDoctorById(int id);  
    public     String    registerOrUpdateDoctor(Doctor doctor);//full object modification
    public     String     updateDoctorDetails(int id , String newQlfy , long newMobileNo);
    public     String  removeAllDoctors();
    public   String   removeDoctorsByIds(Iterable<Integer> ids);
    public    String   removeDoctorById(int id);
}
