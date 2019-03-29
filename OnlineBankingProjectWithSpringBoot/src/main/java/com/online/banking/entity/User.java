package com.online.banking.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.online.banking.security.UserRole;

@Entity
@Table(name = "Onlie_User")
public class User implements Serializable {

	private static final long serialVersionUID = 4392254238968427232L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private boolean enabled = true;

	@OneToOne
	private PrimaryAccount primaryAccount;
	@OneToOne
	private SavingsAccount savingsAccount;
	@OneToMany(mappedBy = "Onlie_User", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Appointment> appointment;
	@OneToMany(mappedBy = "Onlie_User", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Recipient> recipient;
	@OneToMany(mappedBy = "Onlie_User", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<UserRole> UserRole = new HashSet<UserRole>();

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public User() {
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public PrimaryAccount getPrimaryAccount() {
		return primaryAccount;
	}

	public void setPrimaryAccount(PrimaryAccount primaryAccount) {
		this.primaryAccount = primaryAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	public List<Recipient> getRecipient() {
		return recipient;
	}

	public void setRecipient(List<Recipient> recipient) {
		this.recipient = recipient;
	}

	public Set<UserRole> getUserRole() {
		return UserRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		UserRole = userRole;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", enabled="
				+ enabled + ", primaryAccount=" + primaryAccount + ", savingsAccount=" + savingsAccount
				+ ", appointment=" + appointment + ", recipient=" + recipient + ", UserRole=" + UserRole + ", address="
				+ address + "]";
	}

}
