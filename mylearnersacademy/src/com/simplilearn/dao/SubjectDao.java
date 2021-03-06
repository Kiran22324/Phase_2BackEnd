package com.simplilearn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.simplilearn.entity.Subject;
import com.simplilearn.util.HibernateUtil;

public class SubjectDao {

	public Subject getSubject(int id) {
		Transaction transaction = null;
		Subject student = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			student = session.get(Subject.class, id);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return student;
	}

	public Subject saveSubject(Subject student) {
		Transaction transaction = null;
		Subject createdSubject = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(student);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return createdSubject;
	}

	@SuppressWarnings("unchecked")
	public List<Subject> getAllSubjects() {
		Transaction transaction = null;
		List<Subject> listOfSubjects = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an student object
			listOfSubjects = session.createQuery("from Subject").getResultList();

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfSubjects;
	}
}