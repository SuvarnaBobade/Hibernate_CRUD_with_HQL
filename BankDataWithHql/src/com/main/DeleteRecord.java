package com.main;

import java.awt.print.Book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Bank;

public class DeleteRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "DELETE FROM Bank where Account_Number=:accNo";
		Query<Bank> query = ss.createQuery(hqlquery);
		query.setParameter("accNo", 2);
		query.executeUpdate();
		System.out.println("Record deleted sucessfully.....!");
		tr.commit();
		ss.close();

	}
}
