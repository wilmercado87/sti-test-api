package com.sti.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sti.api.model.Activity;
import com.sti.api.model.Employee;
import com.sti.api.services.ActivityService;
import com.sti.api.services.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ManagerActivitiesController {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	ActivityService activityService;
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployees() {
		List<Employee> list = employeeService.getEmployees();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/activities")
	public ResponseEntity<List<Activity>> getActivities() {
		List<Activity> list = activityService.getActivities();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping("/activity/save")
	public ResponseEntity<Activity> saveActivity(@RequestBody Activity activity) {
		return ResponseEntity.ok(activityService.saveActivity(activity));
	}
	
	@PutMapping("/activity/update")
	public ResponseEntity<Activity> updateActivity(@RequestBody Activity activity) {
		return ResponseEntity.ok(activityService.saveActivity(activity));
	}
	
	@PutMapping("/activity/delete")
	public ResponseEntity<Activity> deleteActivity(@RequestBody Activity activity) {
		activityService.deleteActivity(activity);
		return ResponseEntity.ok(activity);
	}
	
}
