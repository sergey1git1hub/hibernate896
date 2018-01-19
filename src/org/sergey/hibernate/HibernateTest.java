package org.sergey.hibernate;

import org.sergey.javabrains.dto.Address;
import org.sergey.javabrains.dto.FourWheeler;
import org.sergey.javabrains.dto.TwoWheeler;
import org.sergey.javabrains.dto.UserDetails;
import org.sergey.javabrains.dto.Vehicle;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateTest {

	public static void main(String[] args) {
		Vehicle vehicle =new Vehicle();
		vehicle.setVehicleName("car");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("Bike Steering Handle.");
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("Porshe");
		car.setSteeringWheel("Steering Wheel.");
		
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(vehicle);
		session.save(bike);
		session.save(car);
		
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
