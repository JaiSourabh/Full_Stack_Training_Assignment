package com.example.Tm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Tm.model.Trainee;
import com.example.Tm.services.TraineeService;

@RestController
public class TraineeController {
	
	@Autowired
	public TraineeService tService;
	
	@PostMapping("/createTrainee")
	public Trainee createTrainee(@RequestBody Trainee t) {
		return tService.createTrainee(t);
	}
	
	@GetMapping("/getTraineeById/{id}")
	public Trainee getTraineeById(@PathVariable int id) {
		return tService.getTraineeById(id);
	}
	
	@GetMapping("/getAllEmployee")
	public List<Trainee> getAllTrainee(){
		return tService.getAllTrainee();
	}
	
	@PutMapping("/updateEmployee")
	public Trainee modifyTrainee(@RequestBody Trainee trainee) {
		return tService.updateTrainee(trainee);
	}
	
	@DeleteMapping("/deleteTrainee/{tid}")
	public String removeEmployee(@PathVariable int tid) {
		return tService.removeTrainee(tid);
	}
	
}
