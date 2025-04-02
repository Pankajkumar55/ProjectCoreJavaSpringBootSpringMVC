package com.nt.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Doctor;

import jakarta.transaction.Transactional;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer>  {
      //@Query("FROM Doctor"  )
      //@Query("FROM Doctor doc ")
      //@Query("FROM Doctor as doc ")
           @Query("SELECT doc FROM  Doctor as doc")
      public  List<Doctor>  showAllDoctors();  
           
         @Query("from Doctor where specialization in(?1,?2,?3) order by specialization asc")
      public  List<Doctor>  showAllDoctorsBySpecializations(String speciality1,String speciality2,String speciality3);
      
           
        /*   @Query("from Doctor where specialization in(:special1,:special2,:special3) order by specialization asc")
           public  List<Doctor>  showAllDoctorsBySpecializations(@Param("special1")String speciality1,
                                                                                                                @Param("special2") String speciality2,
                                                                                                                @Param("special3") String speciality3); */
           
        /*@Query("from Doctor where specialization in(?1,?2,:special3) order by specialization asc")
        public  List<Doctor>  showAllDoctorsBySpecializations(String special1,
                                                                                                              String special2,
                                                                                                              String special3);
        */
           
           
           @Query("from Doctor where income>=:startRange and income<=:endRange order by income desc") // Bulk Entity Query 
            public  List<Doctor>   showDoctorsByIncome(double startRange,double  endRange);
           
           @Query("select did,dname,qlfy from Doctor where qlfy in(:qlfy1,:qlfy2,:qlfy3)") // Bulk Scalar/Projection  Query selecting spefici multiple col values 
           public  List<Object[]>   showDoctorsDataByQualifications(String qlfy1,String qlfy2,String qlfy3);
           
           @Query("select dname from Doctor where specialization=:speciality")  // Bulk  scalar/Projection Query giving single col value
           public  List<String>   showDoctorsNameBySpecialization(String speciality);
           
         
         //  Single Row  Entity Query
         @Query("from Doctor where dname=:name")
         public  Doctor    showDoctorDetailsByName(String name);
      
         //  Single Row  Scalar Query  (specific multiple col values)
         @Query("select did,dname,income from Doctor where dname=:name")
         public  Object  showDoctorDataByName(String name);

         //       Single Row  Scalar Query  (specific single col values)
         @Query("select income from Doctor where dname=:name")
         public  Double  showDoctorIncomeByName(String name);
         
         
         // aggregate operation
         @Query("  select  distinct count(dname) from Doctor")
         public    long    showUniqueDoctorsCount();
         
         @Query("select count(*), max(income), min(income), sum(income) , avg(income)  from Doctor  ")
         public    Object    showDoctorsAggregateData();
       
        //===============================NON-SELECT Operations==========================
       @ Query("update Doctor set income=:newIncome where  specialization in(:speciality1,:speciality2)")
       @Modifying
       @Transactional
       public  int    updateDoctorsIncomeBySpecializations(double newIncome,String speciality1,String speciality2);
       
       @ Query("delete  from Doctor where income>=:start and income<=:end")
       @Modifying
       @Transactional
       public  int    removeDoctorsByIncomeRange(double start,double end);
       
       //native SQL Query
       @Query(value="SELECT now()  from dual",nativeQuery = true)
       public    LocalDateTime    showSystemDateAndTime();
           
}
