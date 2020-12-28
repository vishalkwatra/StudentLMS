package com.ey.hr.lms.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ey.hr.lms.code.entities.Student;

@RestController
public class StudentController {

	@Autowired
	Student studentObj;
	
	@RequestMapping("/getAllInfo")
	public String getAllStudentInfo() {
		return studentObj.giveAllInString();
	}

	@RequestMapping("/getAllInfo/{agePassedInURL}")
	public String getAllStudentInfoWithAge(@PathVariable("agePassedInURL") int age) {
		return studentObj.giveAllInString() + " ,Age: " + Integer.toString(age);
	}

	@RequestMapping("/getAllInfoJSON")
	public Student getAllStudentInfoAgeJSON(Student StudentObj) {
		return StudentObj;
	}

//	@RequestMapping(method=RequestMethod.POST, value="/setInfo")
//	public String setStudentInfo(@RequestBody Student StudentObj) {
//		return StudentObj.changeValue();
//	}

	@RequestMapping(method = RequestMethod.POST, value = "/setInfo")
	public Student setStudentInfo(@RequestBody Student studentObj) {
		studentObj.changeValueofLocation();
		return studentObj;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/changeInfo")
	public Student setStudentInfoPUT(@RequestBody Student studentObj) {
		studentObj.changeValueofLocation();
		return studentObj;
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteInfo")
	public Student setStudentInfoDelete(@RequestBody Student studentObj) {
		studentObj.changeValueofLocation();
		return studentObj;
	}
}
