package org.sergey.hibernate;


import org.sergey.javabrains.dto.UserDetails;


import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateTest {

	public static void main(String[] args) {
	
		//create objects
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		for(int i=0; i< 10; i++){
			UserDetails user = new UserDetails();
			user.setUserName("User" + i);
			session.save(user);
		}
		
		//save them
		
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
