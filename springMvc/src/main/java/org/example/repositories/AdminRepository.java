package org.example.repositories;

import org.example.model.UtilisateurEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class AdminRepository {

    Session session = null;


    public List<UtilisateurEntity> getUserByRole(String role) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT u from UtilisateurEntity u where role=:role");
        query.setParameter("role", role);
//        System.out.println(role);
        try {
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public void ConfirmerUsersRegister(int id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
         session.beginTransaction();
//         UtilisateurEntity user = session.find(UtilisateurEntity.class, id);
        UtilisateurEntity user = session.get(UtilisateurEntity.class, id);

        try {
            user.setConfirmation(true);
            session.update(user);
            session.getTransaction().commit();
//            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }


