package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class HospitalEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long patient_Id;
	
	@Column
	private String patient_Name;
	
	@Column
	private String patient_Blood_Group;
	
	@Column
	private int patient_age;
	
	@Column
	private long patient_MobileNo;

		

}
/*
{
	"Patient_Id":"",
	"Patient_Name":"",
	"Patient_Blood_Group":"",
	"Patient_Age":"",
	"Patient_MobileNo":""
}
*/

