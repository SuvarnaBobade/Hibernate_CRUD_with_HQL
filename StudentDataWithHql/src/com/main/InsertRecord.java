package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class InsertRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "insert into Student (stud_name,address,age,gender,adhar_no)values(:Sname,:Sadd,:Sage,:Sgender,:sAdhar)";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("Sname", "Priya");
		query.setParameter("Sadd", "pune");
		query.setParameter("Sage", 23);
		query.setParameter("Sgender", "Female");
		query.setParameter("sAdhar", 333334233);
		query.executeUpdate();
		System.out.println("record inserted sucessfully........!");
		tr.commit();
		ss.close();

	}
}