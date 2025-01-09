package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.EmployeeEntity;

public class InsertRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "insert into EmployeeEntity(name,department,salary,Address)values(:ename,:eDep,:eSalary,:eAdd)";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("ename", "sham");
		query.setParameter("eDep", "java devloper");
		query.setParameter("eSalary", 20000);
		query.setParameter("eAdd", "pune");
		query.executeUpdate();
		System.out.println("insert record sucessfully...!");
		tr.commit();
		ss.close();
	}
}
