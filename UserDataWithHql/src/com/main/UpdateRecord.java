package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.User;

public class UpdateRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(User.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "update User set email=:U_Email,password=:U_Pass,firstName=:U_Fname,lastName=:U_Lname where userId=:id ";
		Query<User> query = ss.createQuery(hqlquery);
		query.setParameter("id", 1);
		query.setParameter("U_Email", "pgamil");
		query.setParameter("U_Pass", "p@123");
		query.setParameter("U_Fname", "prachi");
		query.setParameter("U_Lname", "patil");
		query.executeUpdate();
		tr.commit();
		ss.close();

	}
}
