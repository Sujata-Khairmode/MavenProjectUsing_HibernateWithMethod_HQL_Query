package com.controller;

import com.dao.TeacherDao;

public class TeacherController {
public static void main(String[] args) {
	TeacherDao td = new TeacherDao();
//	td.InsertData();
//	td.UpdateData();
//	td.DeleteData();
//	td.FetchAll();
	td.GetOneRec();
}
}
