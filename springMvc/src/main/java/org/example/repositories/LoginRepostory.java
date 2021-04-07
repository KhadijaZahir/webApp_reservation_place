package org.example.repositories;

import org.example.model.UtilisateurEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;


@Repository
public class LoginRepostory {
	
	Transaction tranasaction = null;
	Session session = HibernateUtil.getSessionFactory().getCurrentSession();

	public UtilisateurEntity getUserByEmail(String email) {
		UtilisateurEntity user;
		session.beginTransaction();
		Query query = session.createQuery("SELECT U from UtilisateurEntity U where email=:email");
		query.setParameter("email", email);
		try {
			user = (UtilisateurEntity) query.getSingleResult();
			session.close();//
			return user;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
	
}