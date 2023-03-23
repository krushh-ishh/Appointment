package com.poc.appointment.business;


import java.util.*;

import com.poc.appointment.entity.Appointment;

public class AppointmentList implements IAppointmentList{

	List<Appointment> appointments = new ArrayList<Appointment>();
	
	@Override
	public void Create(Appointment a) {
		
		appointments.add(a);
		 
		
	}

	@Override
	public long getAppointmentById() {
		
		long a = appointments.stream().filter(i-> i.getAppointmentId() ==7 ).count();
		return a; 
		
	}

	@Override
	public List<Appointment> getAllAppointments() {
		
		return appointments;
		
	}

	@Override
	public void updateById() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletebyId() {
		// TODO Auto-generated method stub
		
	}
}
