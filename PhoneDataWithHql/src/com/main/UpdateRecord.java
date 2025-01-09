package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Phone;

public class UpdateRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Phone.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "update Phone set Phone_Number=:PhoneNo,Country_Code=:Countycode,Phone_Model=:phoneModel,Status=:Pstatus,Type=:Ptype where id=:Id";
		Query<Phone> query = ss.createQuery(hqlquery);
		query.setParameter("Id", 2);
		query.setParameter("PhoneNo", 954341334);
		query.setParameter("Countycode", +91);
		query.setParameter("phoneModel", "samsung");
		query.setParameter("Pstatus", "Active");
		query.setParameter("Ptype", "mobile");
		query.executeUpdate();
		System.out.println("record updated sucessfully........!");
		tr.commit();
		ss.close();

	}
}
