package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.entity.Admin;
import com.example.entity.College;
import com.example.service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	CollegeService collegeService;
	
	@PostMapping("/college")
	public College saveCollege(@RequestBody College admin) {
		 
		return collegeService.saveAdmin(admin);
	}

}
