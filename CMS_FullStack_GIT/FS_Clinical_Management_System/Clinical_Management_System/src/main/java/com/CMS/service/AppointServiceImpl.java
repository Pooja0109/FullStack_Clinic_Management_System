package com.CMS.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS.entity.Appointment;
import com.CMS.repository.AppointRepository;

@Service
public class AppointServiceImpl implements AppointService {

	
	@Autowired
	private AppointRepository appointRepository; 
	
	@Override
	public Appointment addAppoint(Appointment appointment) {
			return appointRepository.save(appointment);
		}

	@Override
	public List<Appointment> listAllAppoint() {
		return (List<Appointment>) appointRepository.findAll();
	}
}
