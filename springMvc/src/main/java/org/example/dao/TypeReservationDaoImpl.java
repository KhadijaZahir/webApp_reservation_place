package org.example.dao;

import org.example.model.TypereservationEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class TypeReservationDaoImpl implements TypeReservationDao {
	Session session;

	@Override
	public TypereservationEntity getById(int id) {
		   session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        TypereservationEntity typeRes = session.find(TypereservationEntity.class, id);
	        session.getTransaction().commit();
	        return typeRes;
	}

	@Override
	public List<TypereservationEntity> getAllTypeReservation() {
		  session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        List<TypereservationEntity> typeResList = session.createQuery("From TypereservationEntity").list();
	        session.getTransaction().commit();
	        return typeResList;
	}

	@Override
	public void addTypeReservation(TypereservationEntity tr) {
		 session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        session.save(tr);
	        session.getTransaction().commit();
	        System.out.println("add TypeRes");
		
	}

	@Override
	public void removeTypeReservation(int id) {
		TypereservationEntity tr;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        tr = session.find(TypereservationEntity.class, id);
        if (tr != null){
            session.delete(tr);
            session.flush();
            System.out.println("delete TypeRes");
        }else{
            System.out.println("TypeRes does not exist");
        }
        session.getTransaction().commit();
		
	}

	@Override
	public TypereservationEntity updateTypeReservation(TypereservationEntity tr) {
			  TypereservationEntity TREntity;
		        session = HibernateUtil.getSessionFactory().getCurrentSession();
		        session.beginTransaction();
		        
		        TREntity = session.find(TypereservationEntity.class, tr.getIdTypereseervtaion());
		        if (TREntity != null){
		        	TREntity.setNom(tr.getNom());
		        	TREntity.setDatenbplace(tr.getDatenbplace());
		        	TREntity.setNbapprenant(tr.getNbapprenant());
		            System.out.println("TypeRes  updated");
		        }else{
		            System.out.println("update TypeRes does not exist");
		        }
		        session.getTransaction().commit();
		        return TREntity;
		
	}


}
