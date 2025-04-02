package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;
import com.nt.repository.IPersonRepository;
import com.nt.repository.IPhoneNumberRepository;

@Service
public class OToMOperationsMgmtServiceImpl implements IOToMOperationsMgmtService{
@Autowired
  private  IPersonRepository  personRepo;
@Autowired
  private   IPhoneNumberRepository  phoneRepo;



  @Override
  public List<Object[]> showPersonAndHisPhoneNumbers() {
    return personRepo.showPersonAndPhoneNumbersUsingJoins();
  }



  @Override
  public List<Object[]> showPhoneNumbersAndPerson() {
    return  phoneRepo.showPhoneNumbersAndPersonUsingJoins();
        }
 
}
