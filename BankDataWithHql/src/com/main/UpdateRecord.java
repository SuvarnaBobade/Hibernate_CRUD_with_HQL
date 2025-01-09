package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Bank;

public class UpdateRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "update Bank set Bank_Name=:bankname,Account_Type=:acctype,Branch_Address=:branchadd,Balance=:balance where Account_Number=:accNo";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("accNo", 1);
		query.setParameter("bankname", "icc");
		query.setParameter("acctype", "saving");
		query.setParameter("branchadd", "mumbai");
		query.setParameter("balance", 30000);
		query.executeUpdate();
		System.out.println("Record updated sucessfully......!");
		tr.commit();
		ss.close();
	}
}
