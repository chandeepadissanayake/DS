package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Sensor;

@Repository
public interface SensorRepository extends MongoRepository<Sensor, String>{

	
		
		public List<Sensor> findByFloorNo(int floorNo);
		public Sensor findByRoomNo(int floorNo, int roomNo);

}
