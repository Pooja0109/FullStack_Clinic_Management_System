package com.CMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS.entity.Prescription;
import com.CMS.repository.PrescriptionRepository;


@Service
public class PrescriptionServiceImpl implements PrescriptionService{

	
	@Autowired
	PrescriptionRepository prescriptionRepository;
	
	@Override
	public Prescription addPrescription(Prescription prescription) {
		return prescriptionRepository.save(prescription);
	}

	@Override
	public List<Prescription> listAllPrescription() {
		return  (List<Prescription>)prescriptionRepository.findAll();
	}

	
}
