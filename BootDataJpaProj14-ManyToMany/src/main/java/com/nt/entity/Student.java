package com.nt.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name="JPA_MTM_STUDENT1")
@Entity
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {
  @Id
  @SequenceGenerator(name="gen1",sequenceName = "SID_SEQ",initialValue = 100,allocationSize = 1)
  @GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
  private Integer sid;
  @Column(length = 30)
  @NonNull
  private  String sname;
  @NonNull
  @Column(length = 30)
  private  String  saddrs;
  @NonNull
  @Column(length = 30)
  private  String course;
  @ManyToMany(targetEntity = Faculty.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY,
                                mappedBy = "students")
  private  Set<Faculty>  faculties=new HashSet<Faculty>();

   //toString()
  @Override
  public String toString() {
    return "Student [sid=" + sid + ", sname=" + sname + ", saddrs=" + saddrs + ", course=" + course + "]";
  }
  
}
