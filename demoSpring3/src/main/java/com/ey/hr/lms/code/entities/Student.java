package com.ey.hr.lms.code.entities;

public class Student {

	public String firstName;
	public String lastName;
	public String location;

	public Student() {
		firstName = "Big";
		lastName = "Dino";
		location = "Jungle";
	}

	public String changeValue() {
		return "Mr." + this.firstName + " Lives in " + this.location;
	}
	
	public void changeValueofLocation() {
		this.location = this.location + "/Inside";
	}
	
	public String giveFullName() {
		return this.firstName + " " + this.lastName;
	}

	public String giveLocation() {
		return this.location;
	}

	public String giveAllInString() {
		return "Name: " + this.firstName + " " + this.lastName + ", Location: " + this.location;
	}

	
}
