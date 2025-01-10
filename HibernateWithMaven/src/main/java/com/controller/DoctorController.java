package com.controller;

import com.dao.DoctorDao;

public class DoctorController {
	public static void main(String[] args) {
		DoctorDao dd = new DoctorDao();
//		dd.InsertData();
//        dd.UpdateData();
//		dd.DeleteData();
//		dd.FetchAll();
		dd.GetOneRec();
	}

}
