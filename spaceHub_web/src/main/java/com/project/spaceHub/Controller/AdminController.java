/**
 * 
 */
package com.project.spaceHub.Controller;

import org.slf4j.LoggerFactory;


import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.spaceHub.DTO.AdminDTO;
import com.project.spaceHub.repository.AdminJpaRepository;

/**
 * @author gbemisola
 *
 */
@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	public static final Logger logger =
			LoggerFactory.getLogger(AdminController.class);
	
 AdminJpaRepository adminJpaRepository;
	
	@Autowired
	public void setAdminJpaRepository(AdminJpaRepository adminJpaRepository) {
		
		this.adminJpaRepository = adminJpaRepository;
	}
	
	
	//this method is returning the list of all the admin that have register
	@GetMapping("/")
	public ResponseEntity<List<AdminDTO>> listAllAdmins(){
		
		List<AdminDTO> admin = adminJpaRepository.findAll();
		
		return new ResponseEntity<List<AdminDTO>>(admin, HttpStatus.OK);
	}
	
	//this method create a new admin
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<AdminDTO> createAdmin(@RequestBody final AdminDTO admin){
		
		adminJpaRepository.save(admin);
		
		return new ResponseEntity<AdminDTO>(admin, HttpStatus.CREATED);
	}
}
