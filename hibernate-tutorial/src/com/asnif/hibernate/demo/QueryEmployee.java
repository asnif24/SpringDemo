package com.asnif.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.asnif.hibernate.demo.entity.Employee;

public class QueryEmployee {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("Creating new employee objects...");
			Employee tempEmployee1 = new Employee("HT", "Lin", "IISI");
			Employee tempEmployee2 = new Employee("Mos", "Burger", "ASNIF");
			Employee tempEmployee3 = new Employee("Fried", "Chicken", "KENTUCKY");
			
			session.beginTransaction();
			
			System.out.println("Saving the employees...");
			session.save(tempEmployee1);
			session.save(tempEmployee2);
			session.save(tempEmployee3);
			
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			List<Employee> queryEmployees 
				= session.createQuery("from Employee e where e.company='ASNIF'").getResultList();
			
			System.out.println("result: ");
			System.out.println(queryEmployees);
			
		}
		finally {
			session.close();
		}
		
	}

}
