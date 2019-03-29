package com.online.banking.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.banking.entity.Appointment;

public interface AppointmentDao extends JpaRepository<Appointment, Long> {

    List<Appointment> findAll();
}
