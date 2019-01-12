package com.wsm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wsm.cxf.dodept.Dept;
import com.wsm.cxf.dodept.IDoDept;



public class ServiceTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring*.xml");
		IDoDept service=(IDoDept) context.getBean("dodeptservice");
		Dept d=service.find(20);
		System.out.println(d.getDeptno()+"  "+d.getDname()+"  "+d.getLoc());		
	}
}
