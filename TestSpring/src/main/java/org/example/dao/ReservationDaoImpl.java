package org.example.dao;

import org.example.model.ReservationEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public class ReservationDaoImpl implements ReservationDao{
    Session session;
    @Override
    public void addRes(ReservationEntity reservationEntity) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(reservationEntity);
        session.getTransaction().commit();
        System.out.println("add Res");
    }

    @Override
    public ReservationEntity getResById(int id) {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
       ReservationEntity reservationEntity =session.find(ReservationEntity.class, id);
        session.getTransaction().commit();
        return reservationEntity;
    }

    @Override
    public List<ReservationEntity> getAllRes() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<ReservationEntity> resList = session.createQuery("From ReservationEntity").list();
        session.getTransaction().commit();
        return resList;
    }

    @Override
    public void deleteRes(int id) {

        ReservationEntity reservationEntity;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        reservationEntity = session.find(ReservationEntity.class, id);
        if (reservationEntity != null){
            session.delete(reservationEntity);
            session.flush();
            System.out.println("delete res");
        }else{
            System.out.println("reservation does not exist");
        }
        session.getTransaction().commit();
    }

    @Override
    public ReservationEntity updateRes(ReservationEntity reservation) {
        ReservationEntity reservationEntity;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        reservationEntity = session.find(ReservationEntity.class, reservation.getIdReservation());
        if (reservationEntity != null){
            reservationEntity.setUtilisateur(reservation.getUtilisateur());
            reservationEntity.setDatereservation(reservation.getDatereservation());
            reservationEntity.setConfirmerreservation(reservation.isConfirmerreservation());
            reservationEntity.setTypereservationByIdTypereseervtaion(reservation.getTypereservationByIdTypereseervtaion());
            System.out.println("Res update");
        }else{
            System.out.println("Res does not exist");
        }
        session.getTransaction().commit();
        return reservationEntity;
    }

}

