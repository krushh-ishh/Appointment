package com.poc.appointment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poc.appointment.entity.Appointment;

@Controller
public class BookAppointment {

	
	@RequestMapping("/book-appointment")
	public String createAppointment() {
		return "createAppointment";
	}
	
	@PostMapping("/booked-appointment")
	public String bookappointment(@ModelAttribute Appointment appointment) {
		
		System.out.println(appointment);
		return "index";
	}
}
