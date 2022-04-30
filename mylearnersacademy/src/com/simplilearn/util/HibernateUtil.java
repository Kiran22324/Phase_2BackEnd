package com.simplilearn.util;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.simplilearn.entity.ClassRoom;
import com.simplilearn.entity.Student;
import com.simplilearn.entity.Subject;
import com.simplilearn.entity.Teacher;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory ==  null) {
			try {
				Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
				
				
				
				configuration.addAnnotatedClass(Student.class);
				configuration.addAnnotatedClass(ClassRoom.class);
				configuration.addAnnotatedClass(Teacher.class);
				configuration.addAnnotatedClass(Subject.class);
				
				
				
				Properties hibernateProperties = new Properties();
				hibernateProperties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				hibernateProperties.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
				hibernateProperties.put(Environment.USER, "root");
				hibernateProperties.put(Environment.PASS, "root");
				hibernateProperties.put(Environment.DIALECT, "org.hibernate.dialect.MYSQL5Dialect");
				hibernateProperties.put(Environment.SHOW_SQL, "true");
				hibernateProperties.put(Environment.FORMAT_SQL, "true");
				hibernateProperties.put(Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(hibernateProperties);
				
								
				StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
				
				SessionFactory factory = configuration.buildSessionFactory(builder.build());
				Session session=factory.openSession();
				Transaction transaction=session.beginTransaction();
				session.save("studentModel");
				session.save("classRoomModel");
				
				transaction.commit();
				session.close();
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}

}