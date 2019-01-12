package com.wsm.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wsm.cxf.dodept.Dept;
import com.wsm.cxf.dodept.IDoDept;
import com.wsm.cxf.doemp.IDoEmp;
import com.wsm.po.Emp;



public class ServiceTest2 {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring*.xml");
		IDoEmp service= (IDoEmp) context.getBean("doempservice");
		List<com.wsm.cxf.doemp.Emp> list=service.findAll();
		for(com.wsm.cxf.doemp.Emp e:list){
			System.out.println(e.getEname());
		}
	}
}
