package com.example.Company.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Company.Entity.Employee;
import com.example.Company.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public void addEmployee(Employee employee) {
	    
		employeeRepository.save(employee);
		
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public void deleteEmployee(int id) {
	      
		employeeRepository.deleteById(id);
		
	}

	public void editEmployee(int id, Employee employee) {
	    
		Employee emp = new Employee();
		emp.setEmpID(id);
		emp.setName(employee.getName());
		emp.setJoining_Date(employee.getJoining_Date());
		employeeRepository.save(emp);
		
	}

	

	

     
	
	



}
