package com.poc.appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.appointment.entity.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer>{

}
