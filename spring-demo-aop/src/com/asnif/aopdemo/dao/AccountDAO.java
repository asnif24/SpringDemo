package com.asnif.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.asnif.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount, boolean vipFlag) {
		
		System.out.println(getClass() + ":DOING MY DB WORK: ADDING AN ACCONUT");
	}
	
	public boolean doWork() {
		
		System.out.println(getClass() + ":dowork()");
		
		return false;
	}
	
}
