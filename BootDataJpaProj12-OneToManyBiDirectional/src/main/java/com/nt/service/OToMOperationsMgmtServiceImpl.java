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
  public String registerPersonWithPhoneNumbers(Person per) {
       // save  the object (paren to child)
    int  idVal=personRepo.save(per).getPid();
    return "Person obj and its associated child objs are saved  with the id value::"+idVal;
  }
  
  @Override
    public String registerPhoneNumberWithPerson(List<PhoneNumber> list) {
       List<PhoneNumber> list1=phoneRepo.saveAll(list);
       return  list1.size()+" no.of childs linked with parent are saved";
    }
  
  @Override
    public List<Person> loadPersonAndHisPhoneNumbers() {
      return personRepo.findAll();
    }
  
  @Override
    public List<PhoneNumber> loadPhonesWithPerson() {
      return phoneRepo.findAll();
    }
  
  @Override
    public String removePersonAndHisPhones(int pid) {
      //Load  parent object
    Optional<Person>  opt=personRepo.findById(pid);
    if(opt.isPresent()) {
         //delete  the  parent obj which internally deals the  associated child objs
         Person per=opt.get();
         personRepo.delete(per);
         return  "Person  object its  associated PhoneNumber objs are deleted";
    }
      return "Person  is not found for deletion";
    }
  
  @Override
    public String removePhonesOfAPerson(int pid) {
    //Load   Person object
    Optional<Person>  opt=personRepo.findById(pid);
    if(opt.isPresent()) {
         //get parent object
         Person per=opt.get();
        //get childs of a parent
        Set<PhoneNumber> childs=per.getPhones();
        //nullify the parent of the childs
        childs.forEach(ph->{
            ph.setPerson(null);
        });
        //delete all  childs
        phoneRepo.deleteAllInBatch(childs);
        return  childs.size()+"  no.of  phoneNumbers  from "+pid+" person are deleted";
    }
      return "Person not found for deletion";
    }

  @Override
  public String addNewPhoneNumberToAPerson(int pid, PhoneNumber ph) {
  //Load   Person object
    Optional<Person>  opt=personRepo.findById(pid);
    if(opt.isPresent()) {
      // get parent object
      Person per=opt.get();
 
           //get existing  childs
          Set<PhoneNumber>  childs=per.getPhones();
          //link new  child with parent
          ph.setPerson(per);
         //  add  new child to existing childs
          childs.add(ph);
          per.setPhones(childs);
          //save the child obj
        personRepo.save(per);
          return "New Phone number is added  to existing Person";
    }
    return "Person is not found";
  }
  
  @Override
    public String removePhoneNumbersAndPerson(int pid) {
    //Load   Person object
    Optional<Person>  opt=personRepo.findById(pid);
    if(opt.isPresent()) {
      // get parent object
      Person per=opt.get();
           //get existing  childs
          Set<PhoneNumber>  childs=per.getPhones();
          //delete the childs and associated parent
          childs.forEach(ph->{
              phoneRepo.delete(ph);
          });
          return   "All phoneNumbers and the associated Person  are deleted "+pid; 
    }
      return "Person is not found for deletion";
    }
 
}
