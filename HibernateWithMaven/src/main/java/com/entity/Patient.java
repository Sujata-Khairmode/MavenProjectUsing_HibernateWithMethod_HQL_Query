package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int p_id;
 private String p_name;
 private int age;
 private String gender;
 private long contact;
 private String medicalHistory;
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public String getP_name() {
	return p_name;
}
public void setP_name(String p_name) {
	this.p_name = p_name;
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
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getMedicalHistory() {
	return medicalHistory;
}
public void setMedicalHistory(String medicalHistory) {
	this.medicalHistory = medicalHistory;
}
public Patient() {
	
}
public Patient(int p_id, String p_name, int age, String gender, long contact, String medicalHistory) {
	super();
	this.p_id = p_id;
	this.p_name = p_name;
	this.age = age;
	this.gender = gender;
	this.contact = contact;
	this.medicalHistory = medicalHistory;
}
@Override
public String toString() {
	return "Patient [p_id=" + p_id + ", p_name=" + p_name + ", age=" + age + ", gender=" + gender + ", contact="
			+ contact + ", medicalHistory=" + medicalHistory + "]";
}

 
 

}
