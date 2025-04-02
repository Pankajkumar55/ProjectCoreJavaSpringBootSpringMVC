package com.nt.service;

import java.util.List;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;

public interface IOToMOperationsMgmtService {
    public List<Object[]>  showPersonAndHisPhoneNumbers();
    
    public List<Object[]>  showPhoneNumbersAndPerson();
    
 
}
