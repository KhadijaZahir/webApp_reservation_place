package models;

import javax.persistence.*;

@Entity
@Table(name = "apprenant")
public class ApprenantEntity extends UtilisateurEntity {
	private int reservationnbmax;

	public ApprenantEntity(String nom, String prenom, String email, String password, int phone, int reservationnbmax, RolesEntity rolesByIdRole) {
		super(nom, prenom, email, password, phone, rolesByIdRole);
		this.reservationnbmax = reservationnbmax;
		
	}


	@Basic
	@Column(name = "reservationnbmax")
	public int getReservationnbmax() {
		return reservationnbmax;
	}

	public void setReservationnbmax(int reservationnbmax) {
		this.reservationnbmax = reservationnbmax;
	}

}
