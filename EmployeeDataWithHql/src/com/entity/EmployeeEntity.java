package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int EmpID;
	private String name;
	private String department;
	private float salary;
	private String Address;

	public EmployeeEntity() {

	}

	public EmployeeEntity(int empID, String name, String department, float salary, String address) {
		super();
		EmpID = empID;
		this.name = name;
		this.department = department;
		this.salary = salary;
		Address = address;
	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [EmpID=" + EmpID + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", Address=" + Address + "]";
	}

}
