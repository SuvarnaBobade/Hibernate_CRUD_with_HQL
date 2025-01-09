package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.User;

public class InsertRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = " insert into User (email,password,firstName,lastName)values(:U_Email,:U_Pass,:U_Fname,:U_Lname)";
		MutationQuery MQuery = ss.createMutationQuery(hqlquery);
		MQuery.setParameter("U_Email", "mgamil");
		MQuery.setParameter("U_Pass", "m@123");
		MQuery.setParameter("U_Fname", "mayuri");
		MQuery.setParameter("U_Lname", "patil");
		MQuery.executeUpdate();

		tr.commit();
		ss.close();

	}
}
