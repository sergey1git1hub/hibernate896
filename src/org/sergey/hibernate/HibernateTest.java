package org.sergey.hibernate;

import org.sergey.javabrains.dto.Address;
import org.sergey.javabrains.dto.UserDetails;
import org.sergey.javabrains.dto.Vehicle;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();
		//user.setUserId(1);
		user.setUserName("Sergey");
		
		Vehicle  vehicle = new Vehicle();
		vehicle.setVehicleName("car");
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("jeep");
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
		
		vehicle.getUserList().add(user);
		vehicle2.getUserList().add(user);
	
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.save(vehicle2);
		session.getTransaction().commit();
		session.close();
		
		UserDetails userFromDB = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		userFromDB = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println("User Name retrieved: " + userFromDB.getUserName());
		

	}

}
