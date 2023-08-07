package com.CMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.CMS.entity.Patients;

public interface PatientsRepository extends CrudRepository<Patients,Long> {

}
