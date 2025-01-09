package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Bank;

public class InsertRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "insert into Bank (Bank_Name,Account_Type,Branch_Address,Balance)values(:bankname,:acctype,:branchadd,:balance)";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("bankname", "hdfc");
		query.setParameter("acctype", "saving");
		query.setParameter("branchadd", "nashik");
		query.setParameter("balance", 20000);
		query.executeUpdate();
		System.out.println("Record inserted sucessfully......!");
		tr.commit();
		ss.close();

	}
}
