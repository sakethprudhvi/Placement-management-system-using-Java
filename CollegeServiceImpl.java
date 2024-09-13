package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.College;
import com.example.repository.CollegeRepository;

@Service
public class CollegeServiceImpl implements CollegeService {
	
	
	@Autowired
	CollegeRepository collegeRepository;
	@Override
	public College saveAdmin(College college) {
		
		return collegeRepository.save(college);
	}

}
