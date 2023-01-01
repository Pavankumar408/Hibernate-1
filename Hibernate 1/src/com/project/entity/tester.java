package com.project.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class tester {
	public static void main(String[]args) {
		Configuration config=new Configuration();
		config.addAnnotatedClass(employee.class);
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=config.buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		employee emp=new employee(9, "sakthi", 29, "M", 25000);
		session.save(emp);
		session.getTransaction().commit();
		System.out.println("data saved sucesfully");
		session.close();
		sessionfactory.close();
		
		
	}

}
