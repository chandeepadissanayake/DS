package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//sensor class

@Document
public class Sensor {
	@Id
	String id;
	int floorNo;
	int roomNo;
	int smoke;
	int co2;
	int Status;
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public Sensor(int floorNo, int roomNo, int smoke, int co2,int Status) {
		super();
		this.floorNo = floorNo;
		this.roomNo = roomNo;
		this.smoke = smoke;
		this.co2 = co2;
		this.Status=Status;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getSmoke() {
		return smoke;
	}
	public void setSmoke(int smoke) {
		this.smoke = smoke;
	}
	public int getCo2() {
		return co2;
	}
	public void setCo2(int co2) {
		this.co2 = co2;
	}
	public String toString() {
		return "Floor : "+floorNo+"Room : "+roomNo+"Smoke level: "+smoke+"CO2 level :"+co2+"Status :"+Status;
	}
}
