package com.asnif.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asnif.hibernate.demo.entity.Instructor;
import com.asnif.hibernate.demo.entity.InstructorDetail;
import com.asnif.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Instructor.class)
					.addAnnotatedClass(InstructorDetail.class)
					.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// create the objects
			Instructor tempInstructor = new Instructor("HT", "Lin", "ht@asnif.com");
			InstructorDetail tempInstructorDetail = 
					new InstructorDetail("http://www.asnif.com/videos", "climbing");
			
			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			// start a transaction
			session.beginTransaction();
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!");
		}
		finally {
			session.close();
		}
		
	}

}





