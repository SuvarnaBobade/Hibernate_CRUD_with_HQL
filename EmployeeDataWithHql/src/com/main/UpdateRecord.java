package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.EmployeeEntity;

public class UpdateRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeEntity.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlquery = "update EmployeeEntity set name=:ename,department=:eDep,salary=:eSalary,Address=:eAdd where EmpID=:id";
		Query<EmployeeEntity> query	=ss.createQuery(hqlquery);
		query.setParameter("id", 3);
		query.setParameter("ename", "rutuja");
		query.setParameter("eDep", "java devloper");
		query.setParameter("eSalary", 30000);
		query.setParameter("eAdd", "nashik");
		query.executeUpdate();
		System.out.println("record updated sucessfully....!");
		tr.commit();
		ss.close();
	}
}
