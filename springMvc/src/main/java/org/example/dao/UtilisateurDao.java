package org.example.dao;

import org.example.model.UtilisateurEntity;

import java.util.List;

public interface UtilisateurDao {

    public void addUser(UtilisateurEntity utiEntity);
    public UtilisateurEntity getUserById(int id);
    public List<UtilisateurEntity> getAllUsers();
    public void deleteUser(int id);
    public UtilisateurEntity updateUser(UtilisateurEntity utilisateur);
	
	
}
