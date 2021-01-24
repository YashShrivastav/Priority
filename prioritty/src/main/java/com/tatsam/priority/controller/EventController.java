package com.tatsam.priority.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tatsam.priority.entity.Priority;
import com.tatsam.priority.service.PriorityService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
public class EventController {
	
	@Autowired
	private PriorityService priorityService;
	
	//Home Page after user Registration/Login
	@PostMapping("/home")
	public String getHome()
	{
		return "This is HomePage";
	}
	
	//To View All Priorities
	
	@GetMapping("/priorities")
	public List<Priority> allPriorites()
	{
		return priorityService.getAllPriorities();
	}
	
	@GetMapping("/priorities/{id}")
	public Priority priority(@PathVariable String id)
	{
		return priorityService.getPriority(Long.parseLong(id));
	}
	
	@PostMapping("/priorities")
	public Priority addPriority(@RequestBody Priority priority)
	{
		return priorityService.addPriority(priority);
	}
	
	@PutMapping("/priorities")
	public Priority editPriority(@RequestBody Priority priority)
	{
		return priorityService.updatePriority(priority);
	}
	
	@DeleteMapping("/priorities/{id}")
	public ResponseEntity<HttpStatus> removePriority(@PathVariable String id)
	{
		try {
			priorityService.deletePriority(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	

}
