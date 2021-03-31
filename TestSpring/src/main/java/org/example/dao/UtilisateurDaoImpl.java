package org.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.example.model.ReservationEntity;
import org.example.model.UtilisateurEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Component("UtilisateurDao")
public class UtilisateurDaoImpl implements UtilisateurDao {
	Session session;
    @Override
    public void addUser(UtilisateurEntity user) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(user);
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
        List<UtilisateurEntity> userList = session.createQuery("From UtilisateurEntity").list();
        session.getTransaction().commit();
        return userList;
    }

    @Override
    public void deleteUser(int id) {
    	UtilisateurEntity user;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        user = session.find(UtilisateurEntity.class, id);
        if (user != null){
            session.delete(user);
            session.flush();
            System.out.println("delete user");
        }else{
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
        if (userEntity != null){
            userEntity.setNom(user.getNom());
            userEntity.setPrenom(user.getPrenom());
            userEntity.setEmail(user.getEmail());
            userEntity.setPassword(user.getPassword());
            userEntity.setPhone(user.getPhone());
            userEntity.setRole(user.getRole());
            System.out.println("User updated");
        }else{
            System.out.println("User does not exist");
        }
        session.getTransaction().commit();
        return userEntity;
    }
}
