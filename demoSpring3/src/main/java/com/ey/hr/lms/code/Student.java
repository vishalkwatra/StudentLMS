package com.ey.hr.lms.code;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
	
	public String giveFullName() {
		return this.firstName + " " + this.lastName;
	}

	public String giveLocation() {
		return this.location;
	}

	public String giveAllInString() {
		return "Name: " + this.firstName + " " + this.lastName + ", Location: " + this.location;
	}

	@RequestMapping("/getAllInfo")
	public String getAllStudentInfo() {
		return this.giveAllInString();
	}
	
	@RequestMapping("/getAllInfo/{agePassedInURL}")
	public String getAllStudentInfoWithAge(@PathVariable("agePassedInURL") int age) {
		return this.giveAllInString() + " ,Age: " + Integer.toString(age);
	}
	
	@RequestMapping("/getAllInfoJSON")
	public Student getAllStudentInfoAgeJSON(Student StudentObj) {
		return StudentObj;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/setInfo")
	public String setStudentInfo(@RequestBody Student StudentObj) {
		return StudentObj.changeValue();
	}
}
