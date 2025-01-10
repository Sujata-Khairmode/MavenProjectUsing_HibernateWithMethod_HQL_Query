package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Teacher;

public class TeacherDao {
	public void InsertData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Teacher.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlquery = "insert into Teacher(name,address,mobileNo,city,age,salary,department)values(:name,:address,:mobi,:city,:age,:salary,:dept)";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("name", "Snehal");
		query.setParameter("address", "kadegao");
		query.setParameter("mobi", 2344854858l);
		query.setParameter("city", "pune");
		query.setParameter("age", 28);
		query.setParameter("salary", 20000);
		query.setParameter("dept", "hindi");
		query.executeUpdate();
		System.out.println("inserted..");
		tr.commit();
		ss.close();

	}

	public void UpdateData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Teacher.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "update Teacher set salary=:mysalary where t_id=:id";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("mysalary", 35000);
		query.setParameter("id", 1);
		query.executeUpdate();
		System.out.println("updated..");
		tr.commit();
		ss.close();
	}

	public void DeleteData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Teacher.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "delete from Teacher where t_id=:id";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("id", 3);
		query.executeUpdate();
		System.out.println("deleted..");
		tr.commit();
		ss.close();
	}
	public void FetchAll() {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Teacher.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="from Teacher";
		Query<Teacher> query=ss.createQuery(hqlquery,Teacher.class);
		List<Teacher> list=query.getResultList();
		for (Teacher teacher : list) {
			System.out.println(teacher);
			tr.commit();
			ss.close();
		}
		
	}
	public void GetOneRec() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Teacher.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		String hqlquery="from Teacher where t_id=:id";
		Query<Teacher> query=ss.createQuery(hqlquery, Teacher.class);
		query.setParameter("id", 1);
		Teacher t=query.getSingleResult();
		System.out.println(t);
	}
	

}
