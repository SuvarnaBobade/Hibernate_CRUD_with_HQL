package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll_number;
	private String stud_name;
	private String address;
	private int age;
	private String gender;
	private int adhar_no;

	public Student() {

	}

	public Student(int roll_number, String stud_name, String address, int age, String gender, int adhar_no) {
		super();
		this.roll_number = roll_number;
		this.stud_name = stud_name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.adhar_no = adhar_no;
	}

	public int getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAdhar_no() {
		return adhar_no;
	}

	public void setAdhar_no(int adhar_no) {
		this.adhar_no = adhar_no;
	}

	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", stud_name=" + stud_name + ", address=" + address + ", age="
				+ age + ", gender=" + gender + ", adhar_no=" + adhar_no + "]";
	}

}
