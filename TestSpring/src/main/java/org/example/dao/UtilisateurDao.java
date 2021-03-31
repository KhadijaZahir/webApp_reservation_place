package org.example.dao;

import java.sql.SQLException;
import java.util.List;

import org.example.model.ReservationEntity;
import org.example.model.UtilisateurEntity;

public interface UtilisateurDao {

    public void addUser(UtilisateurEntity utiEntity);
    public UtilisateurEntity getUserById(int id);
    public List<UtilisateurEntity> getAllUsers();
    public void deleteUser(int id);
    public UtilisateurEntity updateUser(UtilisateurEntity utilisateur);
	
	
}
