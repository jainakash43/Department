package com.example.Company.Entity;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Employee {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EmpID;
	
	@Column(name="Name")
	private String Name;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="Joining_Date")
    private Date Joining_Date = new Date(System.currentTimeMillis());


	public int getEmpID() {
		return EmpID;
	}


	public void setEmpID(int empID) {
		EmpID = empID;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Date getJoining_Date() {
		return Joining_Date;
	}


	public void setJoining_Date(Date joining_Date) {
		Joining_Date = joining_Date;
	}
	
	
}
