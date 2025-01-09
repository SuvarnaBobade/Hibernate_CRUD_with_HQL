package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Phone;

public class InsertRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Phone.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "insert into Phone(Phone_Number,Country_Code,Phone_Model,Status,Type)values(:PhoneNo,:Countycode,:phoneModel,:Pstatus,:Ptype)";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("PhoneNo", 951334);
		query.setParameter("Countycode", +91);
		query.setParameter("phoneModel", "vivo");
		query.setParameter("Pstatus", "Active");
		query.setParameter("Ptype", "mobile");
		query.executeUpdate();
		System.out.println("record inserted sucessfully........!");
		tr.commit();
		ss.close();

	}

}
