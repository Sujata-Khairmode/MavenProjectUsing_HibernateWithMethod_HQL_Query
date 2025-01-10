package com.controller;

import com.dao.PatientDao;

public class PatientController {
public static void main(String[] args) {
	PatientDao pd= new PatientDao();
//	pd.InsertData();
//	pd.UpdateData();
//	pd.DeleteData();
	pd.FetchAll();
}
}
