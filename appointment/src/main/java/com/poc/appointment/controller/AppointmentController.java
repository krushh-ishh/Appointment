package com.poc.appointment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.poc.appointment.controller.business.AppointmentService;
import com.poc.appointment.entity.*;

@RestController
public class AppointmentController {
	
	//rest controller will return JSON object in list
	
	@Autowired(required =true)
	private AppointmentService appointmentService;
	
	
	//Get method.... by defualt
	@RequestMapping("/appointment-list")
	public List<Appointment> getAllAppoitnments(){
		
		return appointmentService.getAllAppointments();
		
	}
	
	@RequestMapping("/appointment-list/{id}")
	public Appointment getAppointment(@PathVariable int id) {
		return appointmentService.getAppointment(id);
		
	}
	
	//Post method
	@RequestMapping(method = RequestMethod.POST, value = "/appointment-list")
	public String addAppointment(@RequestBody Appointment appointment) {
		appointmentService.addAppointment(appointment);
		return "Sucessfull";
	}
	
	//PUT method----Update
	@RequestMapping(method = RequestMethod.PUT, value = "/appointment-list/{id}")
	public void updateAppointment(@RequestBody Appointment appointment, @PathVariable int id) {
		appointmentService.updateAppointment(appointment,appointment.getAppointmentId());
	}

	//DELETE method
	@RequestMapping(method = RequestMethod.DELETE, value = "/appointment-list/{id}")
	public void deleteAppointment(@PathVariable int id) {
		 appointmentService.deleteAppointment(id);
		 
		
	}
	
	
	
	//integration of api
	//frontend
	//date fromate
	//appropriate flow of application
	//junit
	
	//http://localhost:8080/appointment-list
	
	

}
