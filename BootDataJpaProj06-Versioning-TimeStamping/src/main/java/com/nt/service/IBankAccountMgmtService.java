package com.nt.service;

import com.nt.entity.BankAccount;

public interface IBankAccountMgmtService {
    public  String    createAccount(BankAccount account);
    public   String   withdrawMoney(long accno, double amount);
    public   String   depositeMoney(long acno,double amount);
    public    BankAccount   findBankAccountByAccno(long acno);
}
