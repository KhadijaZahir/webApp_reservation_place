package org.example.repositories;

import org.example.model.UtilisateurEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;


@Repository
public class LoginRepostory {

	//obtained Session object is obtained from the session factory
	Session session = null;
   //Session session = HibernateUtil.getSessionFactory().getCurrentSession();

	public UtilisateurEntity getUserByEmail(String email) {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		//used to start a transaction which may consists of one or more crude operations like INSERT,SELECT,DELETE etc.
		session.beginTransaction();
		//Create an instance of Query for executing a Java Persistence query language statement.
		Query query = session.createQuery("SELECT U from UtilisateurEntity U where email=:email");
		query.setParameter("email", email);
		try {
			//Query.getResultList - for general use in any other case.
			//Query.getSingleResult - for use when exactly one result object is expected.
			UtilisateurEntity user = (UtilisateurEntity) query.getSingleResult();
			return user;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
}