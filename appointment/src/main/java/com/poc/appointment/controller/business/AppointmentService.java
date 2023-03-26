package com.poc.appointment.controller.business;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.poc.appointment.entity.Appointment;

@Service
public class AppointmentService {

	private List<Appointment> appointments =  Arrays.asList(
			new Appointment(1,"kas","a","s","s"),
			new Appointment(2,"kas","a","s","s"),
			new Appointment(3,"kas","a","s","s"),
			new Appointment(4,"kas","a","s","s"));
	
	
	public List<Appointment> getAllAppointments(){
		return appointments;
	}
	
	public Appointment getAppointment(int id) {
		return appointments.stream().filter(i->i.getAppointmentId()==id).findFirst().get();
		
	}

	public void addAppointment(Appointment appointment) {
		 appointments.add(appointment);
		
	}
}

