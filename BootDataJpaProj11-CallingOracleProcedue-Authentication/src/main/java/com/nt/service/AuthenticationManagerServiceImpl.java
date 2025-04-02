package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

/*CREATE OR REPLACE PROCEDURE P_AUTHENTICATION_CREDENTIALS 
(
  UNAME IN VARCHAR2 
, PWD IN VARCHAR2 ,
  result out varchar2
) AS
 cnt  number;
BEGIN
  select count(*) into cnt from JPA_CREDENTILAS where username=uname and  password=pwd;
  if(cnt<>0)then
   result:='Valid Credentials';
  else 
    result:='Invalid Credentials';
  end if;
*END P_AUTHENTICATION_CREDENTIALS; */

@Service
public class AuthenticationManagerServiceImpl implements IAuthenticationMgmtService {
  @Autowired
  private EntityManager  manager;

  @Override
  public String login(String username, String password) {
    // create StoredProcedureQuery Object
     StoredProcedureQuery  query=manager.createStoredProcedureQuery("P_AUTHENTICATION_CREDENTIALS");
     // register the  parameters of  PL/SQL PRocedure
     query.registerStoredProcedureParameter(1,String.class, ParameterMode.IN);
     query.registerStoredProcedureParameter(2,String.class, ParameterMode.IN);
     query.registerStoredProcedureParameter(3,String.class, ParameterMode.OUT);
     
      // set the values to  IN parmaeters
       query.setParameter(1, username);
       query.setParameter(2, password);
       
     //execute the Query
     String  result=(String) query.getOutputParameterValue(3);
    return result;
  }

}
