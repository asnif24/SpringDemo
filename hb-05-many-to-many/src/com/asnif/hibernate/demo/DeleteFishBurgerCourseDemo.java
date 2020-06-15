package com.asnif.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asnif.hibernate.demo.entity.Course;
import com.asnif.hibernate.demo.entity.Instructor;
import com.asnif.hibernate.demo.entity.InstructorDetail;
import com.asnif.hibernate.demo.entity.Review;
import com.asnif.hibernate.demo.entity.Student;

public class DeleteFishBurgerCourseDemo {

	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Instructor.class)
					.addAnnotatedClass(InstructorDetail.class)
					.addAnnotatedClass(Course.class)
					.addAnnotatedClass(Review.class)
					.addAnnotatedClass(Student.class)
					.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction
			session.beginTransaction();
			
			// get the Fish Burger course from DB
			int courseId = 11;
			Course tempCourse = session.get(Course.class, courseId);
			
			// delete the course
			System.out.println("Delete course: "+ tempCourse);
			session.delete(tempCourse);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!!");
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}





