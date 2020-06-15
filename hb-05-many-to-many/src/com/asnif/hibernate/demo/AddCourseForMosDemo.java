package com.asnif.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asnif.hibernate.demo.entity.Course;
import com.asnif.hibernate.demo.entity.Instructor;
import com.asnif.hibernate.demo.entity.InstructorDetail;
import com.asnif.hibernate.demo.entity.Review;
import com.asnif.hibernate.demo.entity.Student;

public class AddCourseForMosDemo {

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
			
			// get the student Mos from database
			int studentId = 4;
			Student tempStudent = session.get(Student.class, studentId);
			
			System.out.println("\nLoaded student: "+tempStudent);
			System.out.println("Course: "+tempStudent.getCourses());
			
			// create more courses
			Course tempCourse1 = new Course("Rice Burger - How to Grow Rice");
			Course tempCourse2 = new Course("Beef Burger - Grilling is So Great");
			Course tempCourse3 = new Course("Chicken Burger - Fried Chicken can Make You Fly");
			
			// add the student to courses
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			tempCourse3.addStudent(tempStudent);
			
			// save the courses
			System.out.println("\nSave the courses ...");
			session.save(tempCourse1);
			session.save(tempCourse2);
			session.save(tempCourse3);
			
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





