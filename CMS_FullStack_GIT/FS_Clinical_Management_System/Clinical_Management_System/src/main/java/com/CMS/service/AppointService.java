package com.CMS.service;

import java.util.List;

import com.CMS.entity.Appointment;

public interface AppointService {
	public Appointment addAppoint(Appointment appointment);
	public List<Appointment> listAllAppoint();
}
