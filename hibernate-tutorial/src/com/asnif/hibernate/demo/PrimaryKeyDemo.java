package com.asnif.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asnif.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Student.class)
					.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// create 3 student objects
			System.out.println("Creating 3 student object3...");
			Student tempStudent1 = new Student("Mos", "Burger", "mos@asnif.com");
			Student tempStudent2 = new Student("Mc", "Donald", "mc@asnif.com");
			Student tempStudent3 = new Student("Burger", "King", "burger@asnif.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the students...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!");
		}
		finally {
			session.close();
		}
		
	}

}





