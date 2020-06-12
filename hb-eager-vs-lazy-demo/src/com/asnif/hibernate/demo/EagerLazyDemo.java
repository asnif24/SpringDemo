package com.asnif.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asnif.hibernate.demo.entity.Course;
import com.asnif.hibernate.demo.entity.Instructor;
import com.asnif.hibernate.demo.entity.InstructorDetail;

public class EagerLazyDemo {

	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Instructor.class)
					.addAnnotatedClass(InstructorDetail.class)
					.addAnnotatedClass(Course.class)
					.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction
			session.beginTransaction();

			// get the instructor form DB
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);
			
			System.out.println("asnif: Instructor: "+ tempInstructor);
			
			System.out.println("asnif: Courses: "+tempInstructor.getCourses());
			
			// commit transaction
			session.getTransaction().commit();
			
			// close the session
			session.close();

			System.out.println("\nasnif: The session is now closed!!\n");
			// option 1: call getter method while session is open
			
			// get course for the instructor
			System.out.println("asnif: Courses: "+tempInstructor.getCourses());
			
			System.out.println("asnif: Done!!");
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}





