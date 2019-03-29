package com.online.banking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "User_Profile")
public class Recipient {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long profileId;
	private String name;
	private String emil;
	private String phone;
	private String accountNuber;
	private String description;

	@ManyToOne
	@JoinColumn(name="userId")
	@JsonIgnore
	private User user;

	public Recipient() {
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmil() {
		return emil;
	}

	public void setEmil(String emil) {
		this.emil = emil;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAccountNuber() {
		return accountNuber;
	}

	public void setAccountNuber(String accountNuber) {
		this.accountNuber = accountNuber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Recipient [profileId=" + profileId + ", name=" + name + ", emil=" + emil + ", phone=" + phone
				+ ", accountNuber=" + accountNuber + ", description=" + description + ", user=" + user + "]";
	}

}
