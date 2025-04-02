package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service
public class DocotorMgmtServiceImpl implements IDoctorMgmtService {
  @Autowired
  private  IDoctorRepository  doctorRepo;

  @Override
  public Iterable<Doctor> showAllDoctorsBySorting(boolean ascOrder, String... props) {
      // create Sort object
     Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
     //use  repo
     Iterable<Doctor>  it=doctorRepo.findAll(sort);
   return it;
   }
  
  @Override
  public Page<Doctor> showAllDoctorsByPageNo(int pageNo, int pageSize) {
    // create the Pageable object
    Pageable pageable=PageRequest.of(pageNo, pageSize);
    // get the requested  page records
    Page<Doctor>  page=doctorRepo.findAll(pageable);
    return page;
  }

  @Override
  public Page<Doctor> showAllDoctorsByPageNoAsSorted(int pageNo, int pageSize, boolean ascOrder, String... props) {
    
    Sort  sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
    //create Pageable object  having Sort object
    Pageable pageable=PageRequest.of(pageNo, pageSize,sort);
    // get the requested  page records
    Page<Doctor>  page=doctorRepo.findAll(pageable);
    return page;
  }
  
  @Override
  public void showAllDoctorsInPagination(int pageSize) {
    // get the count of records
    long count=doctorRepo.count();
    //  get count pagesCount
    long pagesCount=count/pageSize;
    if(count%pageSize!=0)
          pagesCount++;
  
    for(int i=0;i<pagesCount;++i) {
      //  get Pageable object for  every page
      Pageable  pageable=PageRequest.of(i, pageSize);
      //get  each page records
      Page<Doctor> page=doctorRepo.findAll(pageable);
      //display each pgae records
      System.out.println("====Page no::"+(page.getNumber()+1)+"/"+page.getTotalPages()+"=====records are");
      page.forEach(System.out::println);
      System.out.println("----------------------");
    }
    
    
  }

}
