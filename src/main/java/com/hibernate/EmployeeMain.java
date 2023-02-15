package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		Employee emp=new Employee();
		
		emp.setName("anjali");
		emp.setCity("pune");
		
		Adhar ad=new Adhar();
		
		ad.setAdharId(1);
		ad.setAdharNo("123456");
		ad.setEmp(emp);
		
		emp.setAd(ad);
		
		s.save(emp);
		s.save(ad);
		
		t.commit();
		
		s.close();
	}

}
