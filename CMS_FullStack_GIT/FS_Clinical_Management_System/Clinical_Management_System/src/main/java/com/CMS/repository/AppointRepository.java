package com.CMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.CMS.entity.Appointment;

public interface AppointRepository extends CrudRepository<Appointment,Long>{

}
