package com.poc.appointment.business;

import java.util.List;

import com.poc.appointment.entity.Appointment;

public interface IAppointmentList {

	
	public void Create(Appointment a);
	public long getAppointmentById();
	public List<Appointment> getAllAppointments();
	public void updateById();
	public void deletebyId();
	
	
}
