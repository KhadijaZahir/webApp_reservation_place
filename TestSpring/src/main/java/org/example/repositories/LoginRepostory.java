package org.example.repositories;

import java.util.List;

import org.example.util.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.Query;
import org.example.model.UtilisateurEntity;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


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