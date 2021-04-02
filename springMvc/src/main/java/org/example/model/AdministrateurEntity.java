package org.example.model;


import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "admin")
public class AdministrateurEntity extends UtilisateurEntity {

	public AdministrateurEntity() {
		
	}
		
	public AdministrateurEntity(String nom, String prenom, String email, String password, int phone, RolesEntity role) {
		super(nom, prenom, email, password, phone, role);
	}
	

}
