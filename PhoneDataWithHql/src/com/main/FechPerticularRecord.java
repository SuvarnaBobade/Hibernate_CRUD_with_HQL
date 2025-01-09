package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Phone;

public class FechPerticularRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Phone.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from Phone where id=:ID";
		Query<Phone> query = ss.createQuery(hqlquery, Phone.class);
		query.setParameter("ID", 1);
		Phone p = query.getSingleResult();
		System.out.println(p);
	}

}
