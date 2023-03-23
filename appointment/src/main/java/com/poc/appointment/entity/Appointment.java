package com.poc.appointment.entity;

public class Appointment {

	private int appointmentId;
	private String userId;
	private String appointmentDay;
	private String appointmentTime;
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
	
	
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
