package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sensor;
import com.example.demo.repository.SensorRepository;

@Service
public class SensorService {
	
	@Autowired
	private SensorRepository sensorRepository;
	
	//create operations 
	public Sensor create (int floorNo,int roomNo,int smoke,int co2,int Status) {
		return sensorRepository.save(new Sensor(floorNo,roomNo, smoke, co2,Status));
		
	}

	//retrieve operations
	
	public List<Sensor> getAll(){
		return sensorRepository.findAll();	
	}
	
	public Sensor getByRoomNo(int floorNo,int roomNo) {
		return sensorRepository.findByRoomNo(floorNo,roomNo);
	}
	
	//update operations
	public Sensor update (int floorNo,int roomNo,int smoke,int co2) {
		Sensor s=sensorRepository.findByRoomNo(floorNo,roomNo);
		s.setCo2(smoke);
		s.setCo2(co2);
		return sensorRepository.save(s);
	}
	
	//delete operations
	public void deleteAll () {
		sensorRepository.deleteAll();
	}
	public void delete(int floorNo,int roomNo) {
		Sensor s = sensorRepository.findByRoomNo(floorNo,roomNo);
		sensorRepository.delete(s);
	}
	
}
 