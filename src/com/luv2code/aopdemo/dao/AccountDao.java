package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDao {
	
	public void addAccount(Account theAccount,boolean vipFlag) {
		System.out.println(getClass() + "DOING MY DB WORK !! ADDING ACCOUNT");
	}
	
	public boolean doWork() {
		System.out.println("DO SOME WORKOUT !!");
		return true;
	}

}
