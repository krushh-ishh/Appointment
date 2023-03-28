package com.poc.appointment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

import com.poc.appointment.business.AppointmentList;
import com.poc.appointment.business.IAppointmentList;
import com.poc.appointment.entity.Appointment;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		System.out.println("hello");
		return "index";
	}
	
	@RequestMapping("/input")
	public String userInputforAppointment() {
		int id = 7; 
		String userIdString = "kashish";
		String appDate = "kashish";
		String appTime = "kashish";
		String appWith = "kashish";
		
		IAppointmentList iAppointmentList = new AppointmentList();
		iAppointmentList.Create(new Appointment(id, userIdString, appDate, appTime, appWith));
		
		return "successfull";
	}
	
	@RequestMapping("/display")
	public List<Appointment> showAppointment() {
		
		IAppointmentList iAppointmentList = new AppointmentList();
		List<Appointment> list = iAppointmentList.getAllAppointments();
		
		list.forEach(i->System.out.println(""+ i.getUserId()));
		
		
		return list;
		
	}
	
	@RequestMapping("/count")
	public long showntAppCou() {
		
		IAppointmentList iAppointmentList = new AppointmentList();
		return  iAppointmentList.getAppointmentById();
		
		
	}
}
