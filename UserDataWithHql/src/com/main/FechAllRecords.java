package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.User;

public class FechAllRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from User";
		Query<User> query = ss.createQuery(hqlquery, User.class);
		List<User> list = query.getResultList();
		System.out.println("All records of the users are........");

		for (User user : list) {
			System.out.println(user);
		}
		tr.commit();
		ss.close();
	}
}
