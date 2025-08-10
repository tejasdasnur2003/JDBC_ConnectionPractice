package com.example.demo;

import lombok.Data;

@Entity(name="Laptop_info")
@Data
public class EntityLaptop {
	
	@Column(name="Laptop_id")
	@Id
	public int id;
	@Column(name="Laptop_cost")
	private int cost ;
	
	private String laptopModelName;
	public String laptopType;
	
	
	
}