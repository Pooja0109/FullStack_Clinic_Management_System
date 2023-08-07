package com.CMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS.entity.Patients;
import com.CMS.exception.PatientAlreadyExistException;
import com.CMS.exception.PatientDoesNotExistException;
import com.CMS.repository.PatientsRepository;

@Service
public class PatientsServiceImpl implements PatientsService{

	@Autowired
	PatientsRepository patientsRepository;

	
	@Override
	public Patients addPatient(Patients patients) throws PatientAlreadyExistException {
		if(patientsRepository.findById(patients.getIdUser()).isPresent())
		{
			throw new PatientAlreadyExistException();
		}
		else
		return patientsRepository.save(patients);
	}

	@Override
	public List<Patients> listAllPatients() {
		return (List<Patients>)patientsRepository.findAll();
	}

	@Override
	public Patients updatePatient(Patients patients) throws PatientDoesNotExistException {
		if (patients.getIdUser() != 0 && patientsRepository.existsById(patients.getIdUser())) {
			return patientsRepository.save(patients);
		} else {
			// Handle the case when the patients does not exist
			throw new PatientDoesNotExistException();
		}
	}

	@Override
	public void deleteByPatientId(Long patient_id) throws PatientDoesNotExistException{
		if (patientsRepository.findById(patient_id).isEmpty()) {
			throw new PatientDoesNotExistException();
		} else
			patientsRepository.deleteById(patient_id);
	}

	@Override
	public Optional<Patients> searchByIdUser(Long patient_id) throws PatientDoesNotExistException {
		return patientsRepository.findById(patient_id);
	}

}
