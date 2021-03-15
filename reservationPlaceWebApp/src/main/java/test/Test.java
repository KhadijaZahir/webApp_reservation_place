package test;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import models.AdministateurEntity;
import models.ApprenantEntity;
import models.ReservationEntity;
import models.RolesEntity;
import models.TypereservationEntity;
import models.UtilisateurEntity;
import util.HibernateUtil;

public class Test {
	static Session session = HibernateUtil.getSessionFactory().getCurrentSession();

	public static void main(String[] args) {
	
		
		RolesEntity role = new RolesEntity("apprenant");
		UtilisateurEntity utilisateurs = new UtilisateurEntity("Nani","Nani", "n@gmail","123", 0677777, role);
		ApprenantEntity apprenant = new ApprenantEntity("andy","andy", "andy@gmail","123", 0677777, 3, role);
		AdministateurEntity admin = new AdministateurEntity("m","m", "m@gmail","123", 0677777, 2, role);
        TypereservationEntity typeReservation = new TypereservationEntity("weekend", 25);

		ReservationEntity reservation = new ReservationEntity(false, null, typeReservation);
		 
		Session session = null;
		Transaction transaction = null;
		try {

			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
//			session.persist(user);
			// lancer des mises à jour dans la session et faire automatiquement le commit
			// session.flush();
			session.persist(utilisateurs);
			session.persist(role);
			session.persist(apprenant);
			session.persist(admin);
			session.persist(reservation);
			session.persist(typeReservation);

			transaction.commit();
			System.out.println("bien creer !");
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
}
