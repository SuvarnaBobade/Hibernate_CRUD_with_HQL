package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.EmployeeEntity;

public class DeleteRecord {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(EmployeeEntity.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf .openSession();
	Transaction tr = ss.beginTransaction();
	String hqlquery= "DELETE FROM EmployeeEntity WHERE EmpID =:EmpID";
	 	Query<EmployeeEntity> query=ss.createQuery(hqlquery);
	 	query.setParameter("EmpID", 2);
	 	 query.executeUpdate();
	 	 System.out.println("deleted");
	 	tr.commit();
	 	ss.close();
	
}
}
