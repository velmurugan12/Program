package com.maven.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeList {

public static List<Employee> employeeRecords=new ArrayList<Employee>();
	
	/*public EmployeeList(){
		employeeRecords = new ArrayList<Employee>();
	}*/
//    public static EmployeeList getInstance() {	
//	EmployeeList emplist = new EmployeeList();
//	return emplist;
//	}
	public void add(Employee emp) {
		
		employeeRecords.add(emp);
	}
	
	public  List<Employee> getEmployeeRecords() {
		return employeeRecords;
	}
}
