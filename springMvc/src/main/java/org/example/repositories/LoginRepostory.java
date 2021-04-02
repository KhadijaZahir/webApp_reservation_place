package org.example.repositories;

import org.example.model.UtilisateurEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;


@Repository
public class LoginRepostory {
	
	Session session = null;
	Transaction tranasaction = null;

	public UtilisateurEntity getUserByEmail(String email) {
		UtilisateurEntity user;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("from UtilisateurEntity where email=:email");
		query.setParameter("email", email);
		try {
			user = (UtilisateurEntity) query.getSingleResult();
			return user;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
}