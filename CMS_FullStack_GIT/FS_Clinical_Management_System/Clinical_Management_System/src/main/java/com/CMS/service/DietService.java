package com.CMS.service;

import java.util.List;

import com.CMS.entity.Diet;

public interface DietService {
	public Diet addDiet(Diet diet);
	public List<Diet> listAllDiet();
}
