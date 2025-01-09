package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Account_Number;
	private String Bank_Name;
	private String Account_Type;
	private String Branch_Address;
	private float Balance;
	
	
	public Bank() {
		
	}
	
	public Bank(int account_Number, String bank_Name, String account_Type, String branch_Address, float balance) {
		super();
		Account_Number = account_Number;
		Bank_Name = bank_Name;
		Account_Type = account_Type;
		Branch_Address = branch_Address;
		Balance = balance;
	}

	public int getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(int account_Number) {
		Account_Number = account_Number;
	}
	public String getBank_Name() {
		return Bank_Name;
	}
	public void setBank_Name(String bank_Name) {
		Bank_Name = bank_Name;
	}
	public String getAccount_Type() {
		return Account_Type;
	}
	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}
	public String getBranch_Address() {
		return Branch_Address;
	}
	public void setBranch_Address(String branch_Address) {
		Branch_Address = branch_Address;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}

	@Override
	public String toString() {
		return "Bank [Account_Number=" + Account_Number + ", Bank_Name=" + Bank_Name + ", Account_Type=" + Account_Type
				+ ", Branch_Address=" + Branch_Address + ", Balance=" + Balance + "]";
	}
	
	
}

