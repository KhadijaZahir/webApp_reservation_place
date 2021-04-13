package org.example.dao;

import org.example.model.RolesEntity;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao{
	Session session;
	@Override
	public RolesEntity getById(int id) {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        RolesEntity role = session.find(RolesEntity.class, id);
        session.getTransaction().commit();
        return role;
	}

	@Override
	public List<RolesEntity>listRoles() {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<RolesEntity> roleList = session.createQuery("From RolesEntity").getResultList();
        session.getTransaction().commit();
        return roleList;
	}

	@Override
	public void addRoles(RolesEntity r) {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(r);
        session.getTransaction().commit();
        System.out.println("add role");
		
	}

	@Override
	public void RemoveRoles(int id) {
		RolesEntity role;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        role = session.find(RolesEntity.class, id);
        if (role != null){
            session.delete(role);
            session.flush();
            System.out.println("delete role");
        }else{
            System.out.println("role does not exist");
        }
        session.getTransaction().commit();
		
	}

	@Override
	public RolesEntity updateRoles(RolesEntity rl) {
		RolesEntity rolesEntity;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        rolesEntity = session.find(RolesEntity.class, rl.getIdRole());
        if (rolesEntity != null){
        	rolesEntity.setRoleName(rl.getRoleName());
            System.out.println("Role update");
        }else{
            System.out.println("Role does not exist");
        }
        session.getTransaction().commit();
        return rolesEntity;
		
	}
 
}