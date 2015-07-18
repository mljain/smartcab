package com.smartcab.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDetailsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails details = new UserDetails();
		details.setUserId(1);
		details.setUserName("Soumya");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(details);
		session.getTransaction().commit();

	}

}
