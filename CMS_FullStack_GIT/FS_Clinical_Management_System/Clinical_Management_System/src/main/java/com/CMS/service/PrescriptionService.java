package com.CMS.service;

import java.util.List;

import com.CMS.entity.Prescription;

public interface PrescriptionService {
	public Prescription addPrescription(Prescription prescription) ;
	public List<Prescription> listAllPrescription();
}
