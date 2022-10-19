package com.example.Tm.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Tm.model.Trainee;
import com.example.Tm.repository.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService{
	
	@Autowired
	public TraineeRepository traineeRepository;

	@Override
	public Trainee createTrainee(Trainee t) {
		Trainee newTrainee=new Trainee();
		try {
		newTrainee=	traineeRepository.save(t);
		}
		catch (Exception e) {
			System.out.println("Exception while inserting employee...");
		}
		return newTrainee;   
	}

	@Override
	public Trainee getTraineeById(int id) {
		Trainee t=new Trainee();
		try {
			t=convertIntoTrainee(traineeRepository.findById(id));
		}
		catch(Exception e) {
			System.out.println("Exception while get Trainee By ID");
		}
		return t;
	}
	
	public Trainee convertIntoTrainee(Optional<Trainee> tr) {
		Trainee trainee=new Trainee();
		if(tr!=null) {
				trainee.settId(tr.get().gettId());
				trainee.settName(tr.get().gettName());
				trainee.setbName(tr.get().getbName());
		}
		return trainee;
	}

	@Override
	public List<Trainee> getAllTrainee() {
		List<Trainee> list=new ArrayList<>();
		try {
		list=traineeRepository.findAll();
		}
		catch(Exception e) {
			System.out.println("Exception occurs while getting all Employee..");
		}
		return list;
	}

	@Override
	public Trainee updateTrainee(Trainee t) {
		Trainee ut=new Trainee();
		try {
		ut=	getTraineeById(t.gettId());
		if(ut!=null) {
			ut.settName(t.gettName());
			ut.setbName(t.getbName());
		}
		}
		catch (Exception e) {
			System.out.println("Exception occurs while updating employee");
		}
		return ut;
	}

	@Override
	public String removeTrainee(int id) {
		Trainee tr=new Trainee();
		boolean flag=false;
		try {
			tr=getTraineeById(id);
			if(tr!=null) {
				traineeRepository.deleteById(id);
				flag=true;
			}
		}
		catch(Exception e) {
			System.out.println("Exception occurs while deleting employee");
		}
		
		if(flag==true) {
			return "Trainee with "+id+" deleted successfully...";
		}
		else {
			return "Trainee with "+ id+" does not exist";
		}
		
	}
	
}
