package com.cg.CollectionService.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.CollectionService.service.Mobile;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("Spring3.xml");
		Mobile mobile=(Mobile)app.getBean("mob");
		mobile.printmobiledetails();

	}

}
