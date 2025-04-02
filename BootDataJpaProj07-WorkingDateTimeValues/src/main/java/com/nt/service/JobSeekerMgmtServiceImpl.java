package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Service
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
  @Autowired
  private IJobSeekerRepository  jsRepo;

  @Override
  public String registerJobSeeker(JobSeeker js) {
    //  save the object
    int idVal=jsRepo.save(js).getJsId();
    return "JobSeeker is  saved with id value:"+idVal;
  }
  
  @Override
  public Iterable<JobSeeker> showAllJobSeeker() {
    return jsRepo.findAll();
  }

  @Override
  public double showJsAgeById(int id) {
    return jsRepo.findJsAgeById(id);
  }

}
