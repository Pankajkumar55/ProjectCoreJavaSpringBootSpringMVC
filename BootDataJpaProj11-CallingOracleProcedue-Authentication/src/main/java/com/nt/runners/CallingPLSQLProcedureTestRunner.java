package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IAuthenticationMgmtService;

@Component
public class CallingPLSQLProcedureTestRunner implements CommandLineRunner {
  @Autowired
  private  IAuthenticationMgmtService  authService;

  @Override
  public void run(String... args) throws Exception {
       try {
         // invoke the service
         String msg=authService.login("raja", "hyd1");
         System.out.println(msg);
       }
       catch(Exception e) {
         e.printStackTrace();
       }

  }

}
