package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long employeeId;
	
	@Column
	private String employeeName;
	
	@Column
	private String employeeRole;
	
	@Column
	private int mobileNo;

	
}
/*
{
	"employeeId":"",
	"employeeName":"",
	"employeeRole":"",
	"mobileNo":""
}
*/
