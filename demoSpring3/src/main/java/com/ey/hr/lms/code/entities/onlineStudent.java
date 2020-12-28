package com.ey.hr.lms.code.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("online")
public class onlineStudent implements Student{
	
	public String firstName;
	public String lastName;
	public String location;	
	
	onlineStudent(){
		this.firstName = "Big";
		this.lastName = "Dino";
		this.location = "Laptop";
	}

	@Override
	public String giveAllInString() {
		return "Name: "+this.firstName+" "+this.lastName+", from "+this.location;
	}
}
