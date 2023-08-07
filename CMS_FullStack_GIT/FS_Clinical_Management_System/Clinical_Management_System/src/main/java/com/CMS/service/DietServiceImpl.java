package com.CMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CMS.entity.Diet;
import com.CMS.entity.Patients;
import com.CMS.repository.DietRepository;
import com.CMS.repository.PatientsRepository;

@Service
public class DietServiceImpl implements DietService{

	@Autowired
	DietRepository dietRepository;
	
	@Override
	public Diet addDiet(Diet diet) {
		return dietRepository.save(diet);
	}

	@Override
	public List<Diet> listAllDiet() {
		return (List<Diet>)dietRepository.findAll();
	}
	
}
