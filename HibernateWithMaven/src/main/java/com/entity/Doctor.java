package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int d_id;
	private String d_fname;
	private String d_lname;
	private String specialization;
    private long phoneNumber;
    private String isAvailable;
    
    
	public Doctor() {
		
	}
	
	public Doctor(int d_id, String d_fname, String d_lname, String specialization, long phoneNumber,
			String isAvailable) {
		super();
		this.d_id = d_id;
		this.d_fname = d_fname;
		this.d_lname = d_lname;
		this.specialization = specialization;
		this.phoneNumber = phoneNumber;
		this.isAvailable = isAvailable;
	}

	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public String getD_fname() {
		return d_fname;
	}
	public void setD_fname(String d_fname) {
		this.d_fname = d_fname;
	}
	public String getD_lname() {
		return d_lname;
	}
	public void setD_lname(String d_lname) {
		this.d_lname = d_lname;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String isAvailable() {
		return isAvailable;
	}
	public void setAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Doctor [d_id=" + d_id + ", d_fname=" + d_fname + ", d_lname=" + d_lname + ", specialization="
				+ specialization + ", phoneNumber=" + phoneNumber + ", isAvailable=" + isAvailable + "]";
	}
    
    

}
