package com.asnif.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asnif.hibernate.demo.entity.Course;
import com.asnif.hibernate.demo.entity.Instructor;
import com.asnif.hibernate.demo.entity.InstructorDetail;
import com.asnif.hibernate.demo.entity.Review;

public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {
		// Create session factory
		SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Instructor.class)
					.addAnnotatedClass(InstructorDetail.class)
					.addAnnotatedClass(Course.class)
					.addAnnotatedClass(Review.class)
					.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction
			session.beginTransaction();

			// create the course
			Course tempCourse = new Course("FishBurger - A Great Tuna!!");
			// add some reviews
			tempCourse.addReview(new Review("Fish is delicious ><>"));
			tempCourse.addReview(new Review("Fish is wonderful ><>"));
			tempCourse.addReview(new Review("Fish is fucking great ><>"));
			
			// save the course ... and leverage the cascade all :)
			System.out.println("Saving the course: ");
			System.out.println(tempCourse);
			System.out.println(tempCourse.getReviews());
			session.save(tempCourse);
			
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





