package org.example.test;

import org.example.dao.ReservationDaoImpl;
import org.example.dao.RoleDaoImpl;
import org.example.dao.TypeReservationDaoImpl;
import org.example.dao.UtilisateurDaoImpl;
import org.example.model.AdministrateurEntity;
import org.example.model.ApprenantEntity;
import org.example.model.ReservationEntity;
import org.example.model.RolesEntity;
import org.example.model.TypereservationEntity;
import org.example.model.UtilisateurEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {


		// role test
//	    Session session1 = HibernateUtil.getSessionFactory().getCurrentSession();
//	    Transaction transaction = session1.beginTransaction();
//	    RolesEntity roleEntity1=new RolesEntity();
//	    roleEntity1.setRoleName("admin");
//	    session1.persist(roleEntity1);
//	    transaction.commit();


		// test dao
//		UtilisateurDaoImpl userDao = new UtilisateurDaoImpl();
//		RoleDaoImpl roldao = new RoleDaoImpl();
//		ReservationDaoImpl resDao = new ReservationDaoImpl();
//		TypeReservationDaoImpl typeResDao = new TypeReservationDaoImpl();
//
//		RolesEntity role= new RolesEntity("stddd");
//		UtilisateurEntity utilisateurs = new UtilisateurEntity();
////		UtilisateurEntity utilisateurs = new UtilisateurEntity("b","b", "n@gmail","123", 0677777, role);
//		TypereservationEntity typeReservation = new TypereservationEntity("9 TO 5", 25, "2021-03-30");
//		ReservationEntity res = new ReservationEntity(false, "2021-03-30", utilisateurs, typeReservation);
//		ApprenantEntity appre = new ApprenantEntity("andy", "andy", "andy@gmail", "123", 0677777, 3, role);
//		AdministrateurEntity admin = new AdministrateurEntity("md", "md", "md@gmail", "123", 0677777, role);
//        ApprenantEntity appre = new ApprenantEntity(3);
//        AdministrateurEntity admin = new AdministrateurEntity();
//		userDao.addUser(admin);
//		userDao.addUser(appre);
//		roldao.addRoles(role);
//		resDao.addRes(res);
//		typeResDao.addTypeReservation(typeReservation);


		// Session session;
//		Session session = null;
//		Transaction transaction = null;
//		try {
//
//			session = HibernateUtil.getSessionFactory().getCurrentSession();
//			transaction = session.beginTransaction();
////			session.persist(user);
			// lancer des mises à jour dans la session et faire automatiquement le commit
			// session.flush();
//			session.persist(utilisateurs);
//			session.persist(role);
//			session.persist(res);
//			session.persist(appre);
//			session.persist(admin);
//			session.persist(typeReservation);
//
//			transaction.commit();
//			System.out.println("bien creer !");
//		} catch (Exception e) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
//			e.printStackTrace();
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//
//		}

		/// test entity

//		RolesEntity role = new RolesEntity("student");
//		UtilisateurEntity utilisateurs = new UtilisateurEntity();
////		UtilisateurEntity utilisateurs = new UtilisateurEntity("b","b", "n@gmail","123", 0677777, role);
//		TypereservationEntity typeReservation = new TypereservationEntity("samedi", 25, "2021-09-23");
//		ReservationEntity res = new ReservationEntity(false, "2021-09-23", utilisateurs, typeReservation);
//		ApprenantEntity appre = new ApprenantEntity("bb", "bb", "bb@gmail", "123", 0677777, 3, role);
//		AdministrateurEntity admin = new AdministrateurEntity("b", "b", "n@gmail", "123", 0677777, role);
////        ApprenantEntity appre = new ApprenantEntity(3);
////        AdministrateurEntity admin = new AdministrateurEntity();
//
//		// Session session;
//		Session session = null;
//		Transaction transaction = null;
//		try {
//
//			session = HibernateUtil.getSessionFactory().getCurrentSession();
//			transaction = session.beginTransaction();
////			session.persist(user);
//			// lancer des mises à jour dans la session et faire automatiquement le commit
//			// session.flush();
//			session.persist(utilisateurs);
//			session.persist(role);
//			session.persist(res);
//			session.persist(appre);
//			session.persist(admin);
//			session.persist(typeReservation);
//
//			transaction.commit();
//			System.out.println("bien creer !");
//		} catch (Exception e) {
//			if (transaction != null) {
//				transaction.rollback();
//			}
//			e.printStackTrace();
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//
//		}
		
		
		//***********************************************************
		// getById role dao
//		RoleDaoImpl roldao = new RoleDaoImpl();
//		RolesEntity rolee = rl.getById(11);
//		System.out.println(rolee.getRoleName());
		// add role dao

		// list role dao
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getRoleName());
//		}
//          update role dao
//		rl.updateRoles(new RolesEntity(3, "THREE"));

		// delete role dao
//		rl.RemoveRoles(3);

		
		
		//***************************************************
		
	}
}
