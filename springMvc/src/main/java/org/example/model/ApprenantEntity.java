package org.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "apprenant")
public class ApprenantEntity extends UtilisateurEntity {
	@Column(name = "reservationnbmax")
	private int reservationnbmax;

	public ApprenantEntity(int reservationnbmax) {
		super();
		this.reservationnbmax = reservationnbmax;
	}

	public ApprenantEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApprenantEntity(String nom, String prenom, String email, String password, int phone, RolesEntity role) {
		super(nom, prenom, email, password, phone, role);
	}

	public ApprenantEntity(String nom, String prenom, String email, String password, int phone) {
		super(nom, prenom, email, password, phone);
	}

	public ApprenantEntity(String nom, String prenom, String email, String password, int phone, int reservationnbmax,
			RolesEntity role) {
		super(nom, prenom, email, password, phone, role);
		this.reservationnbmax = reservationnbmax;
	}

	public int getReservationnbmax() {
		return reservationnbmax;
	}

	public void setReservationnbmax(int reservationnbmax) {
		this.reservationnbmax = reservationnbmax;
	}

}
