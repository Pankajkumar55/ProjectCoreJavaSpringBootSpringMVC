package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankAccount;
import com.nt.repository.IBankAccountRepository;

@Service
public class BankAccountMgmtServiceImpl implements IBankAccountMgmtService {
  @Autowired
  private IBankAccountRepository  bankRepo;

  @Override
  public String createAccount(BankAccount account) {
    long acno=bankRepo.save(account).getAcno();
    return  "Bank Account is  opened with  account  number ::"+acno;
  }

  @Override
  public String withdrawMoney(long accno, double amount) {
      // Load  the Account
    Optional<BankAccount>  opt=bankRepo.findById(accno);
    if(opt.isPresent()) {
      // get the object
      BankAccount  account=opt.get();
      // update the object
      account.setBalance(account.getBalance()-amount);
       bankRepo.save(account);
       return  amount+"  money is  withdran from  the BankAccount";
    }
    else {
        return   accno+"  Bank  account   not found";
    }
  }

  @Override
  public String depositeMoney(long acno, double amount) {
    // Load  the Account
   Optional<BankAccount>  opt=bankRepo.findById(acno);
  if(opt.isPresent()) {
    // get the object
    BankAccount  account=opt.get();
    // update the object
    account.setBalance(account.getBalance()+amount);
     bankRepo.save(account);
     return  amount+"  money deposited to  the BankAccount";
  }
  else {
      return   acno+"  Bank  account  is not found";
  }
  }
  
  @Override
  public BankAccount findBankAccountByAccno(long acno) {
      //Load object
    BankAccount  account=bankRepo.findById(acno).orElseThrow(()->new IllegalArgumentException("Invalid BankAccount number"));
    return account;
  }

}
