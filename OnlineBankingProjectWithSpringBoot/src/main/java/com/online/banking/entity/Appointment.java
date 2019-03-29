package com.online.banking.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User_Appointment")
public class Appointment {

	private Long appointmentId;
	private Date date;
	private String userLocation;
	private String descriptionl;
	private boolean appointmentConfirmed;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	public Appointment() {
	}

	public Long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public String getDescriptionl() {
		return descriptionl;
	}

	public void setDescriptionl(String descriptionl) {
		this.descriptionl = descriptionl;
	}

	public boolean isAppointmentConfirmed() {
		return appointmentConfirmed;
	}

	public void setAppointmentConfirmed(boolean appointmentConfirmed) {
		this.appointmentConfirmed = appointmentConfirmed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", date=" + date + ", userLocation=" + userLocation
				+ ", descriptionl=" + descriptionl + ", appointmentConfirmed=" + appointmentConfirmed + ", user=" + user
				+ "]";
	}

}
