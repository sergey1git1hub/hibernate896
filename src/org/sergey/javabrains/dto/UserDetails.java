package org.sergey.javabrains.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;

@Entity
public class UserDetails {
	@Id @GeneratedValue
	private int userId;
	private String userName;
	
	@ElementCollection
	@JoinTable(name = "USER_ADDRESSES"/*, joinColumns=@JoinColumn(name = "USER_ID")*/)
	private Set<Address> listOfAddresses = new HashSet();
	

	public Set<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses(Set<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


}
