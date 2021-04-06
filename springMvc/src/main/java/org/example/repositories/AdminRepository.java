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

    Transaction tranasaction = null;
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    UtilisateurEntity user =new UtilisateurEntity();


    public List<UtilisateurEntity> getUserByRole(String role) {
        session.beginTransaction();
        Query query = session.createQuery("SELECT u from UtilisateurEntity u where role=:role");
        query.setParameter("role", role);
        System.out.println(role);
        try {
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public void ConfirmerUsersRegister(int id) {
Transaction x = session.beginTransaction();
         UtilisateurEntity user = session.find(UtilisateurEntity.class, id);
        try {
            user.setConfirmation(true);
            session.update(user);
            System.out.println("email " + user.getEmail());
            x.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RejecterUsersRegister(int id) {
        Transaction x = session.beginTransaction();
        UtilisateurEntity user = session.find(UtilisateurEntity.class, id);
        try {
            user.setConfirmation(false);
            session.update(user);
            System.out.println("email " + user.getEmail());
            x.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
