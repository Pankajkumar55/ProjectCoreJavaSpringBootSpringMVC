package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MarriageSeeker;
import com.nt.repository.IMarriageSeekerRepository;

@Service
public class MarriageSeekerMgmtServiceImpl implements IMarriageSeekerMgmtService {
  @Autowired
  private  IMarriageSeekerRepository  msRepo;

  @Override
  public String registerMarriageSeeker(MarriageSeeker info) {
      int idVal=msRepo.save(info).getMid();
    return "MarriageSeeker info is saved with id value :"+idVal;
  }

  @Override
  public MarriageSeeker getMarriageSeekerById(int mid) {
    return msRepo.findById(mid).orElseThrow(()-> new IllegalArgumentException("invalid  id"));
  }

}
