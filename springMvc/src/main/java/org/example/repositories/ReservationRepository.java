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

    Session session = HibernateUtil.getSessionFactory().getCurrentSession();

    public TypereservationEntity getResByName(String name) {
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


    public List<ReservationEntity> getReservationByUser(UtilisateurEntity user){
        session.beginTransaction();
        Query query = session.createQuery("From ReservationEntity where UtilisateurEntity .id=:userId");
        query.setParameter("userId", user.getIdUser());
        List<ReservationEntity> list = query.list();
        return list;
    }

    public void confirmerResrvation(int id) {
        Transaction x = session.beginTransaction();
        ReservationEntity user = session.find(ReservationEntity.class, id);
        try {
            user.setConfirmerreservation(true);
            System.out.println("hey");
            session.flush();
//            session.persist(user);
            x.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




