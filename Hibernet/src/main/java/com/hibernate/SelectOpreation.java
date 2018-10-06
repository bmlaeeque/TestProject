package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectOpreation {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Object o=session.load(Student.class, new Integer(101));
		
		Student s=(Student)o;
		System.out.println(s.getId());
		System.out.println(s.getName());
		
		session.close();

	}

}
