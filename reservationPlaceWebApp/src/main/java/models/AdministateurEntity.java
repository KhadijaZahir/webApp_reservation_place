package models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class AdministateurEntity extends UtilisateurEntity {


	public AdministateurEntity(String nom, String prenom, String email, String password, int phone,
			int reservationnbmax, RolesEntity rolesByIdRole) {
		super(nom, prenom, email, password, phone, rolesByIdRole);

	}

}
