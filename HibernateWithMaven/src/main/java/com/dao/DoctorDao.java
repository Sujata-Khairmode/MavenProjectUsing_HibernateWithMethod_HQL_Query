package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.entity.Doctor;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class DoctorDao {
	public void InsertData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Doctor.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Doctor d = new Doctor();
		d.setD_fname("sai");
		d.setD_lname("joshi");
		d.setSpecialization("cardiologist");
		d.setPhoneNumber(7354357465l);
		d.setAvailable("yes");
		ss.persist(d);
		tr.commit();
		ss.close();
		System.out.println("data is inserted....!");
	}
	
	public void UpdateData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Doctor.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		 int d_id=3;
		 Doctor d1=ss.get(Doctor.class, d_id);
		 d1.setAvailable("no");
		 ss.merge(d1);
		 tr.commit();
		 ss.close();
		 System.out.println("updated..");
	}
	public void DeleteData() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Doctor.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		int d_id=6;
		Doctor dd1=ss.get(Doctor.class, d_id);
		ss.remove(dd1);
		tr.commit();
		ss.close();
		System.out.println("deleted..");
		
	}
	public void FetchAll() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Doctor.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		CriteriaBuilder hcb=ss.getCriteriaBuilder();
		CriteriaQuery<Object> cq=hcb.createQuery();
		Root<Doctor>root=cq.from(Doctor.class);
		cq.select(root);
		
		Query query=ss.createQuery(cq);
		List<Doctor>list=query.getResultList();
		for (Doctor doctor : list) {
			System.out.println(doctor);
		}
		tr.commit();
		ss.close();
	}
	public void GetOneRec() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Doctor.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr=ss.beginTransaction();
		int d_id=1;
		Doctor d2=ss.get(Doctor.class, d_id);
		System.out.println("one record is fetched..");
		System.out.println(d2);
		tr.commit();
		ss.close();
		
	}

}
