package com.luv2code.aopdemo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.luv2code.aopdemo")
@Configurable
@EnableAspectJAutoProxy
public class DemoConfig {
	
	

}
