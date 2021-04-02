package org.example.service;

import org.example.dao.UtilisateurDaoImpl;
import org.example.model.UtilisateurEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Component("utilisateurService")
public class UtilisateurServiceImpl implements UtilisateurService{
    @Autowired
    private UtilisateurDaoImpl utilisateurDaoImpl;

    @Override
    @Transactional
    public void addUser(UtilisateurEntity utiEntity) {
        utilisateurDaoImpl.addUser(utiEntity);
    }

    @Override
    public UtilisateurEntity getUserById(int id) {
        return utilisateurDaoImpl.getUserById(id);

    }

    @Override
    public List<UtilisateurEntity> getAllUsers() {
        return utilisateurDaoImpl.getAllUsers();
    }

    @Override
    public void deleteUser(int id) {
        utilisateurDaoImpl.deleteUser(id);
    }

    @Override
    public UtilisateurEntity updateUser(UtilisateurEntity utilisateur) {
        return utilisateurDaoImpl.updateUser(utilisateur);
    }
}
