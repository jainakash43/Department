package com.example.Company.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Company.Entity.Employee;
import com.example.Company.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	
	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
     
	
    @GetMapping("/all")
    public List<Employee> getAllEmployees()
    {
    	return employeeService.getAllEmployees();
    }
	
    
    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
    	employeeService.deleteEmployee(id);
    }
    
    @PutMapping("/editEmployee/{id}")
    public void editEmployee(@PathVariable int id, @RequestBody Employee employee)
    {
    	employeeService.editEmployee(id,employee);
    }
    
	
}
