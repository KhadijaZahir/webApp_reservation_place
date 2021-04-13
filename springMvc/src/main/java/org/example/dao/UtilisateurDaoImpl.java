package org.example.dao;

import org.example.model.UtilisateurEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

//@Repository annotation is a marker for any class that fulfils the role of a repository (also known as Data Access Object or DAO).
@Repository
@Component("UtilisateurDao")
public class UtilisateurDaoImpl implements UtilisateurDao {
    Session session;

    @Override
    public void addUser(UtilisateurEntity user) {
        //SessionFactory.openSession() always opens a new session that need to be close once the operations is done.
        // SessionFactory.getCurrentSession() returns a session bound to a context - no need to close it.
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        //session.beginTransaction is used to start a transaction
        session.beginTransaction();
        session.save(user);
        // transaction.commit() is used for committing all changes happened during a transaction so that database remains in consistent state after operations
        session.getTransaction().commit();
        System.out.println("add user");
    }

    @Override
    public UtilisateurEntity getUserById(int id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        UtilisateurEntity user = session.find(UtilisateurEntity.class, id);
        session.getTransaction().commit();
        return user;
    }

    @Override
    public List<UtilisateurEntity> getAllUsers() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<UtilisateurEntity> userList = session.createQuery("From UtilisateurEntity").getResultList();
        session.getTransaction().commit();
        return userList;
    }

    @Override
//    @Transactional
    public void deleteUser(int id) {
        UtilisateurEntity user;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        user = session.find(UtilisateurEntity.class, id);
        if (user != null) {
            session.delete(user);
            session.flush();
            System.out.println("delete user");
        } else {
            System.out.println("user does not exist");
        }
        session.getTransaction().commit();
    }

    @Override
    public UtilisateurEntity updateUser(UtilisateurEntity user) {
        UtilisateurEntity userEntity;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        userEntity = session.find(UtilisateurEntity.class, user.getIdUser());
        if (userEntity != null) {
            userEntity.setNom(user.getNom());
            userEntity.setPrenom(user.getPrenom());
            userEntity.setEmail(user.getEmail());
            userEntity.setPassword(user.getPassword());
            userEntity.setPhone(user.getPhone());
            userEntity.setRole(user.getRole());
            System.out.println("User updated");
        } else {
            System.out.println("User does not exist");
        }
        session.getTransaction().commit();
        return userEntity;
    }
}
