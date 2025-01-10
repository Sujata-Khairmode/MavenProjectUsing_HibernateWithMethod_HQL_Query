package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int t_id;
	private String name;
	private String address;
	private long mobileNo;
	private String city;
	private int age;
	private float salary;
	private String department;

  
	
	public Teacher() {
		
	}
	
	
	public Teacher(int t_id, String name, String address, long mobileNo, String city, int age, float salary,
			String department) {
		super();
		this.t_id = t_id;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.city = city;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}


	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Teacher [t_id=" + t_id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", city=" + city + ", age=" + age + ", salary=" + salary + ", department=" + department + "]";
	}

}



