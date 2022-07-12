package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entities.COurse;
import services.courseservices;
@RestController
public class mycontrollar {
	@Autowired
	
	private courseservices crseservises;
	
public String home() {
	return "welcome deep";
	
}
@GetMapping("/COurse")
public List<COurse> getCousrses(){
	return this.crseservises.getCourse();
	
}
@GetMapping("/COurse/{courseId}")
public COurse getCourse(@PathVariable String coursId) {
return this.crseservises.getCourses(Long.parseLong(coursId));	
}
@PostMapping(path="/COurse",consumes="application/json")
public COurse addcourse(@RequestBody COurse course ) {
	return this.crseservises.addCourse(course);
	
}
}
