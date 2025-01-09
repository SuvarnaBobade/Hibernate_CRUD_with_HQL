package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long Phone_Number;
	private int Country_Code;
	private String Phone_Model;
	private String Status;
	private String Type;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(int id, long phone_Number, int country_Code, String phone_Model, String status, String type) {
		super();
		this.id = id;
		Phone_Number = phone_Number;
		Country_Code = country_Code;
		Phone_Model = phone_Model;
		Status = status;
		Type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(long phone_Number) {
		Phone_Number = phone_Number;
	}

	public int getCountry_Code() {
		return Country_Code;
	}

	public void setCountry_Code(int country_Code) {
		Country_Code = country_Code;
	}

	public String getPhone_Model() {
		return Phone_Model;
	}

	public void setPhone_Model(String phone_Model) {
		Phone_Model = phone_Model;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", Phone_Number=" + Phone_Number + ", Country_Code=" + Country_Code
				+ ", Phone_Model=" + Phone_Model + ", Status=" + Status + ", Type=" + Type + "]";
	}

}