package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Phone;

public class FechAllRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Phone.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from Phone";
		Query<Phone> query = ss.createQuery(hqlquery, Phone.class);
		List<Phone> list = query.getResultList();
		for (Phone phone : list) {
			System.out.println(phone);
		}
	}
}
