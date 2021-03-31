package org.example.dao;

import java.util.List;

import org.example.model.RolesEntity;


public interface RoleDao {
	RolesEntity getById(int id);
		List<RolesEntity> listRoles();
		void addRoles(RolesEntity rl);
		void RemoveRoles(int id);
		RolesEntity updateRoles(RolesEntity rl);
	}