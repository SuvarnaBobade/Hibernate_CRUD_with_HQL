package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.EmployeeEntity;

public class FechAllRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EmployeeEntity.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		EmployeeEntity e= new EmployeeEntity();

		String hqlquery = "from EmployeeEntity";

		Query<EmployeeEntity> query = ss.createQuery(hqlquery, EmployeeEntity.class);
		List<EmployeeEntity> list = query.list();
		for (EmployeeEntity employeeEntity : list) {
			System.out.println(employeeEntity);

	}
	}
}
