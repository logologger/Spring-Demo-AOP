package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.luv2code.aopdemo.dao.AccountDao;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String args[]) {
		// read spring config java class
		// get the bean
		// call the business method on that component
		// close the spring context
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao dao = context.getBean("accountDao" , AccountDao.class);
		
		MembershipDAO membersDao = context.getBean("membershipDAO", MembershipDAO.class);
		
		membersDao.addSillyMember();
		
		membersDao.gotoSleep();
		
		dao.addAccount(new Account(), false);
		
		dao.doWork();
		
		context.close();
		
	}
}
