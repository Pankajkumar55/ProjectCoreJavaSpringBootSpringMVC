//Doctor.java (entity class)
package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="JPA_DOCTOR")
@RequiredArgsConstructor
public  class Doctor {
  @Id
  @Column(name="DOCTOR_ID")
 //@SequenceGenerator(name="gen1",sequenceName = "DID_SEQ",allocationSize = 1,initialValue = 100)
  //@GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
  //@GeneratedValue(strategy = GenerationType.SEQUENCE)
  //@GeneratedValue(strategy = GenerationType.AUTO)
  @GeneratedValue
  private Integer did;
  
  @Column(name="DOCTOR_NAME",length = 30)
  @NonNull
  private  String  dname;
  
  @Column(name="DOCTOR_QLFY",length = 30)
  @NonNull
    private  String   qlfy;
  
  @NonNull
    @Column(name="DOCTOR_INCOME")
  private  Long  income;
  
  @Column(name="DOCTOR_MOBILENO")
  @NonNull
    private  Long mobileNo;
  
  @Column(name="DOCTOR_SPECIALIZATION",length = 30)
  @NonNull
  //@Transient
    private  String  specialization;
  
  public  Doctor() {
    System.out.println("Doctor:: 0-param cosntructor::"+this.getClass());
  }
  

}
