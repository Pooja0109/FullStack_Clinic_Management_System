package com.CMS.service;

import java.util.List;
import java.util.Optional;

import com.CMS.entity.Patients;
import com.CMS.exception.PatientAlreadyExistException;
import com.CMS.exception.PatientDoesNotExistException;

public interface PatientsService {
	public Patients addPatient(Patients patients) throws PatientAlreadyExistException;
	public List<Patients> listAllPatients();
	public Patients updatePatient(Patients patients) throws PatientDoesNotExistException;
	public void deleteByPatientId(Long patient_id)throws PatientDoesNotExistException;
	public Optional<Patients> searchByIdUser(Long patient_id) throws PatientDoesNotExistException;
}
