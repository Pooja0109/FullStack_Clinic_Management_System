package com.CMS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CMS.entity.Appointment;
import com.CMS.entity.Diet;
import com.CMS.entity.Patients;
import com.CMS.entity.Prescription;
import com.CMS.exception.PatientAlreadyExistException;
import com.CMS.exception.PatientDoesNotExistException;
import com.CMS.repository.PatientsRepository;
import com.CMS.service.AppointService;
import com.CMS.service.DietService;
import com.CMS.service.PatientsService;
import com.CMS.service.PrescriptionService;

@RestController
public class CMS_Controller {
	
	@Autowired
	PatientsRepository patientsRepository;
	
	@Autowired
	PatientsService patientsService;
	
	@Autowired
	AppointService appointService;
	
	@Autowired
	DietService dietService;
	
	@Autowired
	PrescriptionService prescriptionService;
	
	@PostMapping("/addPatient")
	public Patients addPatient(@RequestBody Patients patients) throws PatientAlreadyExistException {
		return patientsService.addPatient(patients);
	}
	
	@GetMapping("/viewPatients")
	public List<Patients> listAllPatients() {
		return patientsService.listAllPatients();
	}
	
	@PutMapping("/updatePatient")
    public Patients updateDonor(@RequestBody Patients patients) throws PatientDoesNotExistException {
        return patientsService.updatePatient(patients);
    }
	
	@DeleteMapping("/deletePatient/{patient_id}")
	public void deletePatient(@PathVariable("patient_id") Long patient_id) throws PatientDoesNotExistException {
		patientsService.deleteByPatientId(patient_id);
	}
	
	@GetMapping("/searchByPatientId/{patient_id}")
    public Optional<Patients> searchByPatientId(@PathVariable("patient_id") Long patient_id) throws PatientDoesNotExistException
    {
    	return patientsService.searchByIdUser(patient_id);
    }
	
	
	@PostMapping("/addAppoint")
	public Appointment addAppoint(@RequestBody Appointment appointment) {
		return appointService.addAppoint(appointment);
	}
	
	@GetMapping("/listAppoint")
	public List<Appointment> listAllAppoint() {
		return appointService.listAllAppoint();
	}
	
	@PostMapping("/addDiet")
	public Diet addDiet(@RequestBody Diet diet) {
		return dietService.addDiet(diet);
	}
	
	@GetMapping("/listDiet")
	public List<Diet> listAllDiet() {
		return dietService.listAllDiet();
	}
	
	@PostMapping("/addPrep")
	public Prescription addPrep(@RequestBody Prescription prescription) {
		return prescriptionService.addPrescription(prescription);
	}
	
	@GetMapping("/listPrep")
	public List<Prescription> listAllPrep() {
		return prescriptionService.listAllPrescription();
	}


}
