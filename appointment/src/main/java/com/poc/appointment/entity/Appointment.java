package com.poc.appointment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appointment_record")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int appointmentId;
	
	@Column
	private String userId;
	
	@Column
	private String appointmentDay;
	
	@Column
	private String appointmentTime;
	
	@Column
	private String appointmentWith;
	
	
	public Appointment(int appointmentId, String userId, String appointmentDay, String appointmentTime,
			String appointmentWith) {
		super();
		this.appointmentId = appointmentId;
		this.userId = userId;
		this.appointmentDay = appointmentDay;
		this.appointmentTime = appointmentTime;
		this.appointmentWith = appointmentWith;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	} 
	
	public int getAppointmentId() {
		return appointmentId;
	}
	
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getUserId() {
		return userId;
	}
	
	public String getAppointmentDay() {
		return appointmentDay;
	}
	public void setAppointmentDay(String appointmentDay) {
		this.appointmentDay = appointmentDay;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	public String getAppointmentWith() {
		return appointmentWith;
	}
	public void setAppointmentWith(String appointmentWith) {
		this.appointmentWith = appointmentWith;
	}
	
	
	
	
}
