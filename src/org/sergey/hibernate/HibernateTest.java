package org.sergey.hibernate;

import org.sergey.javabrains.dto.Address;
import org.sergey.javabrains.dto.UserDetails;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();
		//user.setUserId(1);
		user.setUserName("Sergey");
		Address addr1 = new Address();
		addr1.setStreet("Street Name");
		addr1.setCity("City Name");
		addr1.setState("State Name");
		addr1.setPincode("100001");
		
		Address addr2 = new Address();
		addr2.setStreet("Street Name");
		addr2.setCity("City Name");
		addr2.setState("State Name");
		addr2.setPincode("200002");
		
		user.getListOfAddresses().add(addr1);
		user.getListOfAddresses().add(addr2);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		UserDetails userFromDB = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		userFromDB = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println("User Name retrieved: " + userFromDB.getUserName());

	}

}
