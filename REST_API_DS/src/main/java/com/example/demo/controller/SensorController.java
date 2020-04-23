package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Sensor;
import com.example.demo.service.SensorService;

@RestController
public class SensorController {

	@Autowired
	private SensorService sensorService;
	
	@RequestMapping("/create")
	public String create(@RequestParam int floorNo, @RequestParam int roomNo,@RequestParam int smoke, @RequestParam int CO2,@RequestParam int Status) {
		Sensor s = sensorService.create(floorNo, roomNo, smoke, CO2,Status);
		return s.toString();
	}
	
	@RequestMapping("/get")
	public Sensor getSensor(int floorNo,int roomNo) {
		return sensorService.getByRoomNo(floorNo,roomNo);
	}
	
	@RequestMapping("/getAll")
	public List<Sensor> getAll(){
		return sensorService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam int floorNo, @RequestParam int roomNo,@RequestParam int smoke, @RequestParam int CO2,@RequestParam int Status) {
		Sensor s = sensorService.create(floorNo, roomNo, smoke, CO2,Status);
		return s.toString();
	}
	@RequestMapping("/delete")
	public String delete(int floorNo,int roomNo) {
		sensorService.delete(floorNo,roomNo);
		return "Deleted floor "+floorNo+" room "+roomNo+" sensor. ";
	}
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		sensorService.deleteAll();
		return "Deleted all records.";
	}
	
}
