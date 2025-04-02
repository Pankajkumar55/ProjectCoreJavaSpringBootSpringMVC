package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {
  
  //@Query(value="select  TRUNC(MONTHS_BETWEEN(SYSDATE, dob)/ 12) from jobseeker_joda where js_id=:id ",nativeQuery = true)
  @Query(value="select  (SYSDATE- TO_DATE(to_char(dob,'dd-MON-yyyy'),'dd-MON-yyyy'))/365.25 from jobseeker_joda where js_id=:id ",nativeQuery = true)
  public double    findJsAgeById(int id);

}
