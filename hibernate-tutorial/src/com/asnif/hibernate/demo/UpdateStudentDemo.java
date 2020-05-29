package com.asnif.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asnif.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Student.class)
					.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			int studentId = 1;
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id : primary key
			System.out.println("\nGetting student with id: " + studentId);
			
			Student myStudent = session.get(Student.class, studentId);
			
			System.out.println("Updating student...");
			
			myStudent.setFirstName("Fox");	// only update in memory, update to DB after commit
			
			// commit the transaction
			session.getTransaction().commit();
			
			// New code
			session = factory.getCurrentSession();
			session.beginTransaction();

			// Update email for all student
			System.out.println("Upadte email for all students");
			session.createQuery("Update Student set email='fox@fjaillraven.com'").executeUpdate();
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!");
		}
		finally {
			session.close();
		}
		
	}

}





