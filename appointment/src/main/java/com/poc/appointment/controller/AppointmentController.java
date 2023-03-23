package com.poc.appointment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.poc.appointment.entity.*;

@RestController
public class AppointmentController {
	
	//rest controller will return JSON object in list
	
	@RequestMapping("/appointment-list")
	public List<Appointment> getAllAppoitnments(){
		
		return Arrays.asList(
				new Appointment(1,"kas","a","s","s"));
		
	}

}
