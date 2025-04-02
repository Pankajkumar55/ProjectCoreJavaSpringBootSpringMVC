//MarriageSeeker.java
package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_LOB_MARRIAGE_SEEKER")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class MarriageSeeker {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer  mid;
  @NonNull
  @Column(length = 30)
  private  String   name;
  @NonNull
  @Column(length = 30)
  private   String  addrs;
  @NonNull
  private  boolean indian;
  @Lob
  @NonNull
  private  byte[]  photo;
  @Lob
  @NonNull
  private  char[]  boidata;
  

}
