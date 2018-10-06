package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class deleteStudent {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/hibernate-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Object o = session.load(Student.class, new Integer(101));

		Student s = (Student) o;
		Transaction tx = session.beginTransaction();
		session.delete(s);
		tx.commit();
		session.close();

	}

}
