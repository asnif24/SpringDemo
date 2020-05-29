package com.asnif.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asnif.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Student.class)
					.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			// display the students
			displayStudents(theStudents);
			
			// query students: lastname = 'Burger'
			theStudents = session.createQuery("from Student s where s.lastName='Burger'").getResultList();
			
			// display the students
			System.out.println("\n\nStudents who have last name of Burger");
			displayStudents(theStudents);
			
			// query students: lastname = 'Burger' or firstname = 'Mc'
			theStudents = session.createQuery("from Student s where " 
					+ "s.lastName='Burger' OR s.firstName='Mc'").getResultList();
			System.out.println("\n\nStudents who have lastname = 'Burger' or firstname = 'Mc'");
			displayStudents(theStudents);	
			
			// query students where email LIKE '%asnif.com'
			theStudents = session.createQuery("from Student s"
					+" where s.email LIKE '%asnif.com'").getResultList();
			System.out.println("\n\nStudents who have email LIKE '%asnif.com'");
			displayStudents(theStudents);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!");
		}
		finally {
			factory.close();
		}
		
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

}





