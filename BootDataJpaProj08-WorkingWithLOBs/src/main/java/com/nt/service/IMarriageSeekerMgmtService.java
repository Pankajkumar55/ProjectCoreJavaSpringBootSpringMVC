package com.nt.service;

import com.nt.entity.MarriageSeeker;

public interface IMarriageSeekerMgmtService {
  public   String registerMarriageSeeker(MarriageSeeker info);
  public   MarriageSeeker   getMarriageSeekerById(int mid);

}
