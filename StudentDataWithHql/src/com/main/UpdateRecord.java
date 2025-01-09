package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Student;

public class UpdateRecord {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "update  Student set stud_name=:Sname,address=:Sadd,age=:Sage,gender=:Sgender,adhar_no=:sAdhar where roll_number=:id";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("id", 2);
		query.setParameter("Sname", "punam");
		query.setParameter("Sadd", "pune");
		query.setParameter("Sage", 24);
		query.setParameter("Sgender", "Female");
		query.setParameter("sAdhar", 333334233);
		query.executeUpdate();
		System.out.println("record updated sucessfully........!");
		tr.commit();
		ss.close();

	}
}
