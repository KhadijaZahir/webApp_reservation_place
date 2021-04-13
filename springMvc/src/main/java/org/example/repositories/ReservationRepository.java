package org.example.repositories;

import org.example.model.ReservationEntity;
import org.example.model.TypereservationEntity;
import org.example.model.UtilisateurEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReservationRepository {

    Session session = null;

    public TypereservationEntity getResByName(String name) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("from TypereservationEntity where nom=: type");
        query.setParameter("type", name);
        try {
            TypereservationEntity reservation = (TypereservationEntity) query.getSingleResult();
            return reservation;
        } catch (Exception e) {
            return null;
        }
    }

    public void confirmerResrvation(int id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        ReservationEntity user = session.find(ReservationEntity.class, id);
        try {
            user.setConfirmerreservation(true);
            session.persist(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    public List<ReservationEntity> getReservationByUser(UtilisateurEntity user){
//        session.beginTransaction();
//        Query query = session.createQuery("From ReservationEntity where UtilisateurEntity .id=:userId");
//        query.setParameter("userId", user.getIdUser());
//        List<ReservationEntity> list = query.list();
//        return list;
//    }
}




