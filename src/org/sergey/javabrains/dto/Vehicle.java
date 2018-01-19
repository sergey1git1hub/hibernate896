package org.sergey.javabrains.dto;

import java.util.ArrayList;

import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name = "VEHICLE_TYPE", discriminatorType = DiscriminatorType.STRING)
public class Vehicle {
	@Id @GeneratedValue
	private int vehicleId;
	private String vehicleName;
	@ManyToMany(mappedBy = "vehicle")
	private Collection<UserDetails>  userList = new ArrayList<UserDetails>();
	
	
	
	public Collection<UserDetails> getUserList() {
		return userList;
	}
	public void setUserList(Collection<UserDetails> user) {
		this.userList = user;
	}

	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	

	
	

}
