package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BankAccount;
import com.nt.service.IBankAccountMgmtService;

@Component
public class VersoningAndTimeStampFeaturesTestRunner implements CommandLineRunner {
  @Autowired
  private IBankAccountMgmtService   bankService;

  @Override
  public void run(String... args) throws Exception {
    
    /* //save object (Create Bank Account)
    try {
       BankAccount  account=new BankAccount("suresh",20000.0,"SBI","savings");
       String msg=bankService.createAccount(account);
       System.out.println(msg);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
    */
    
    try {
      String msg=bankService.withdrawMoney(10000043L, 2000.0);
      System.out.println(msg);
      BankAccount  account=bankService.findBankAccountByAccno(10000043L);
      System.out.println("account  is balance modified for "+account.getUpdateCount()+" times  and opened on "+account.getOpenedOn()+"  lastly operated on"+account.getLastUpdatedOn());
    }
    catch(Exception e) {
      e.printStackTrace();
    }

  }

}
