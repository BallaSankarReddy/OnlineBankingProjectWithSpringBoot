package com.online.banking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Address")
public class Address {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer addressId;
	private String streetName;
	private String CityName;
	private Integer pinCode;
	
	//One to One Relationship
	@OneToOne(mappedBy="address")
	private User user;

	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", streetName=" + streetName + ", CityName=" + CityName
				+ ", pinCode=" + pinCode + ", user=" + user + "]";
	}
	
}
