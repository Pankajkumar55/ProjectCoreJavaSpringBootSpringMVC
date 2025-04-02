package com.nt.service;

import java.util.List;

import com.nt.entity.Person;
import com.nt.entity.PhoneNumber;

public interface IOToMOperationsMgmtService {
    public String  registerPersonWithPhoneNumbers(Person per);
    public   String    registerPhoneNumberWithPerson(List<PhoneNumber>  list);
    public    List<Person>  loadPersonAndHisPhoneNumbers();
    public   List<PhoneNumber>  loadPhonesWithPerson();
    public   String  removePersonAndHisPhones(int pid);
    public   String   removePhonesOfAPerson(int pid);
    public   String    addNewPhoneNumberToAPerson(int pid, PhoneNumber ph);
    public  String    removePhoneNumbersAndPerson(int pid);
}
