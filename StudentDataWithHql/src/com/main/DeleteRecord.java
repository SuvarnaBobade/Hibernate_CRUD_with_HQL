package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Student;

public class DeleteRecord {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "DELETE FROM Student where roll_number=:id";
		Query<Student> query = ss.createQuery(hqlquery);
		query.setParameter("id", 2);
		query.executeUpdate();
		System.out.println("Record deleted sucessfully......!");
		tr.commit();
		ss.close();
	}
}
