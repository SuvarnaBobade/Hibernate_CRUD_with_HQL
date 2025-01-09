package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Bank;

public class FechAllRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "from Bank";
		Query<Bank> query = ss.createQuery(hqlquery);
		List<Bank> list = query.getResultList();
		for (Bank bank : list) {
			System.out.println(bank);
		}
		tr.commit();
		ss.close();

	}
}
