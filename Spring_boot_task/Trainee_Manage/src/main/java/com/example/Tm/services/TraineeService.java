package com.example.Tm.services;

import java.util.List;

import com.example.Tm.model.Trainee;

public interface TraineeService {
	public Trainee createTrainee(Trainee t);
	public Trainee getTraineeById(int id);
	public List<Trainee> getAllTrainee();
	public Trainee updateTrainee(Trainee t);
	public String removeTrainee(int id);
}
