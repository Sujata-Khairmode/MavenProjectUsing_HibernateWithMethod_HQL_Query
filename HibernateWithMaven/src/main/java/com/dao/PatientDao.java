package com.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Patient;

public class PatientDao {

	public void InsertData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter patient name");
		String name = sc.nextLine();

		System.out.println("enter patient age");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("enter your gender");
		String gender = sc.nextLine();

		System.out.println("enetr your contact no");
		long c = sc.nextLong();
		sc.nextLine();

		System.out.println("enter your medical history");
		String m = sc.nextLine();

		String hqlquery = "insert into Patient(p_name,age,gender,contact,medicalHistory)values(:name,:age,:gender,:c,:m)";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("name", name);
		query.setParameter("age", age);
		query.setParameter("gender", gender);
		query.setParameter("c", c);
		query.setParameter("m", m);
		query.executeUpdate();
		System.out.println("insert data successfully");
		tr.commit();
		ss.close();

	}

	public void UpdateData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your patient id");
		int p_id = sc.nextInt();
		sc.nextLine();

		System.out.println("enetr your id");
		String medicalHistory = sc.nextLine();

		String hqlquery = "update Patient set medicalHistory =:myhistroy where p_id=:myid";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("myhistroy", medicalHistory);
		query.setParameter("myid", p_id);
		query.executeUpdate();
		System.out.println("updated patient");
		tr.commit();
		ss.close();

	}

	public void DeleteData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id");
		int p_id = sc.nextInt();
		sc.nextLine();

		String hqlquery = "delete from Patient where p_id=:myid";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("myid", p_id);
		query.executeUpdate();
		System.out.println("patient deleted..");
		tr.commit();
		ss.close();

	}

	public void FetchAll() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

//    	Scanner sc= new Scanner(System.in);
//    	System.out.println("enter a fetch all records of petient");
//    	String p=sc.nextLine();

		String hqlquery = "from Patient";
		Query<Patient> query = ss.createQuery(hqlquery, Patient.class);
		List<Patient> list = query.getResultList();
		for (Patient patient : list) {
			System.out.println(patient);
		}
	}
}
