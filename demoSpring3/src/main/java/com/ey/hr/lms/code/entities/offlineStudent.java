package com.ey.hr.lms.code.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("offline")
public class offlineStudent implements Student {
	public String firstName;
	public String lastName;
	public String location;

	offlineStudent() {
		this.firstName = "Big";
		this.lastName = "Dino";
		this.location = "Current Location";
	}

	@Override
	public String giveAllInString() {
		return "Name: " + this.firstName + " " + this.lastName + ", from " + this.location;
	}
}
