package com.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maven.pojo.Employee;
import com.maven.pojo.EmployeeList;
@Controller
public class EmployeeWrite {

	@Autowired
	public EmployeeList emplist;
	
	@RequestMapping(method = RequestMethod.POST, value="/write/employeedata")
	@ResponseBody
 void list (@RequestBody Employee emp) {
	emplist.add(emp);

	}
	
@RequestMapping(method = RequestMethod.GET, value="/get/employee")
	
	@ResponseBody
	public List<Employee> getEmployee() {
		return emplist.getEmployeeRecords();
		
	}
}
