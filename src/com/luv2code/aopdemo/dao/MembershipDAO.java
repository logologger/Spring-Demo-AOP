package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean addSillyMember() {
		System.out.println(getClass() + "DOING MY MEMBERSHIP WORK !! ADDING ACCOUNT");
		return false;
	}
	
	public void gotoSleep() {
		System.out.println("GO TO SLEEP !!");
	}
}
