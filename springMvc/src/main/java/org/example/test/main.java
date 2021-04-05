package org.example.test;

import org.example.dao.RoleDaoImpl;
import org.example.dao.UtilisateurDaoImpl;
import org.example.model.RolesEntity;
import org.example.model.UtilisateurEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

public class main {

	public static void main(String[] args) {
		final Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		// add user ***************
		RoleDaoImpl roleDao = new RoleDaoImpl();
		RolesEntity roleEntity = roleDao.getById(1);
		UtilisateurEntity studentEntity = new UtilisateurEntity("bou", "bou", "bou@gmail.com", "55", 21,
				roleEntity);
		UtilisateurDaoImpl userDao = new UtilisateurDaoImpl();
		userDao.addUser(studentEntity);

		// list user dao ****************************
//		UtilisateurDaoImpl userDao = new UtilisateurDaoImpl();
//		java.util.List<UtilisateurEntity> util= userDao.getAllUsers();
//		
//		for(int i=0; i < util.size(); i++) {
//			System.out.println(util.get(i).getEmail());
//		}

		// GET BY ID user dao ****************************
//		UtilisateurDaoImpl userDao = new UtilisateurDaoImpl();
//		UtilisateurEntity user = userDao.getUserById(11);
//		System.out.println(user.getEmail());

		// UPDATE user dao ****************************

//		UtilisateurDaoImpl userDao = new UtilisateurDaoImpl();
//		userDao.updateUser(new UtilisateurEntity(2, "zahir", "khadija", "zk@gmail.com", 21,  "55",roleEntity));

		// delete user dao
//		UtilisateurDaoImpl userDao = new UtilisateurDaoImpl();
//		userDao.deleteUser(10);

		// *******************************************************************

		// add role dao ***************
//		RoleDaoImpl roleDao = new RoleDaoImpl();
//		RolesEntity rolesEntity = new RolesEntity("student");
//		roleDao.addRoles(rolesEntity);

		// list role dao ****************************
//		RoleDaoImpl roleDao = new RoleDaoImpl();
//		java.util.List<RolesEntity> r= roleDao.listRoles();	
//		for(int i=0; i < r.size(); i++) {
//			System.out.println(r.get(i).getRoleName());
//		}

		// GET BY ID role dao ****************************
//		RoleDaoImpl roleDao = new RoleDaoImpl();
//		RolesEntity rolesEntity = roleDao.getById(4);
//		System.out.println(rolesEntity.getRoleName());

		// update role dao
//		RoleDaoImpl roleDao = new RoleDaoImpl();
//		roleDao.updateRoles(new RolesEntity(4, "formatrice"));

		// delete role dao
//		RoleDaoImpl roleDao = new RoleDaoImpl();
//		roleDao.RemoveRoles(4);

		// *******************************************************************

		// add reservation dao ***************
//		TypeReservationDaoImpl typeDao = new TypeReservationDaoImpl();
//		TypereservationEntity TypeRese= typeDao.getById(4);
//		UtilisateurDaoImpl userDao = new UtilisateurDaoImpl();
//		UtilisateurEntity user = userDao.getUserById(2);
//		ReservationEntity resEntity = new ReservationEntity(true, "2021-03-30", user, TypeRese);
//		ReservationDaoImpl resDao = new ReservationDaoImpl();
//		resDao.addRes(resEntity);

		// list reservation dao ****************************
//		ReservationDaoImpl resDao = new ReservationDaoImpl();
//		java.util.List<ReservationEntity> r = resDao.getAllRes();
//		for (int i = 0; i < r.size(); i++) {
//			System.out.println(r.get(i).getTypereservationByIdTypereseervtaion());
//			System.out.println(r.get(i).getIdReservation() + "+" + r.get(i).getDatereservation() + "+"
//					+ r.get(i).getTypereservationByIdTypereseervtaion() + "+" + r.get(i).getUtilisateur());
//		}

		// GET BY ID reservation dao ****************************
//		ReservationDaoImpl resDao = new ReservationDaoImpl();
//		ReservationEntity resEntity = resDao.getResById(3);
//		System.out.println(resEntity.getDatereservation());
//		System.out.println(resEntity.getUtilisateur());

		// update reservation dao
//		ReservationDaoImpl resDao = new ReservationDaoImpl();
//		TypeReservationDaoImpl typeDao = new TypeReservationDaoImpl();
//		TypereservationEntity TypeRese= typeDao.getById(2);
//		UtilisateurDaoImpl userDao = new UtilisateurDaoImpl();
//		UtilisateurEntity user = userDao.getUserById(11);
//		resDao.updateRes(new ReservationEntity(3, true, "1993-03-03", user, TypeRese));

		// delete reservation dao
//		ReservationDaoImpl resDao = new ReservationDaoImpl();
//		resDao.deleteRes(5);

		// *******************************************************************

		// add type reservation dao ***************
//				TypeReservationDaoImpl typeDao = new TypeReservationDaoImpl();
//				TypereservationEntity TypeRese= new TypereservationEntity("from 9am to 5pm", 30, "2021-30-03");
//				typeDao.addTypeReservation(TypeRese);

		// list type reservation dao ****************************
//				TypeReservationDaoImpl typeDao = new TypeReservationDaoImpl();
//				java.util.List<TypereservationEntity> r = typeDao.getAllTypeReservation();
//				for (int i = 0; i < r.size(); i++) {
//					System.out.println(r.get(i).getNom());
//				}

		// GET BY ID type reservation dao ****************************
//		TypeReservationDaoImpl typeDao = new TypeReservationDaoImpl();
//		TypereservationEntity TypeRese = typeDao.getById(3);
//		System.out.println(TypeRese.getNom());

		// update type reservation dao
//		TypeReservationDaoImpl typeDao = new TypeReservationDaoImpl();
//		typeDao.updateTypeReservation(new TypereservationEntity(1, "after 17 pm", 30, "20213003"));


		// delete type reservation dao
//		TypeReservationDaoImpl typeDao = new TypeReservationDaoImpl();
//				typeDao.removeTypeReservation(1);

	}

}
