package org.example.dao;

import org.example.model.RolesEntity;

import java.util.List;


public interface RoleDao {
	RolesEntity getById(int id);
		List<RolesEntity> listRoles();
		void addRoles(RolesEntity rl);
		void RemoveRoles(int id);
		RolesEntity updateRoles(RolesEntity rl);
	}