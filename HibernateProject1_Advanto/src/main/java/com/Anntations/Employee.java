package com.Anntations;

import java.util.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name= "EMP_Details")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "EMP_Id")
	private int eid;
	
	@Column(name= "EMP_Name")
	private String ename;
	
	@Column(name= "EMP_Salary")
	private double esal;
	
	@Column(name="EMP_DOB")
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name="EMP_Contact")
	private long econtact;
	
	@Transient     //we dont want to create this column in database
	private int x;
	
	@Column(name="EMP_PhotoCopy")
	@Lob   //Large Object
	private byte[] img;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String ename, double esal, Date dob, long econtact, int x, byte[] img) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.dob = dob;
		this.econtact = econtact;
		this.x = x;
		this.img = img;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public long getEcontact() {
		return econtact;
	}
	public void setEcontact(long econtact) {
		this.econtact = econtact;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", dob=" + dob + ", econtact="
				+ econtact + ", x=" + x + ", img=" + Arrays.toString(img) + "]";
	}
	
	
}
