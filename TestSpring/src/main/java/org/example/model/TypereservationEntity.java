package org.example.model;

import javax.persistence.*;


import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "typereservation")
public class TypereservationEntity implements Serializable{
	@Id
	@GeneratedValue
	@Column(name = "id_typereseervtaion")
	private int idTypereseervtaion;
	private String nom;
	private int nbapprenant;
    private String datenbplace;
    
//    @Transient
//	private Collection<ReservationEntity> reservations;
	
	
	public TypereservationEntity() {
		super();
	}
	

	public TypereservationEntity(int idTypereseervtaion, String nom, int nbapprenant, String datenbplace) {
		super();
		this.idTypereseervtaion = idTypereseervtaion;
		this.nom = nom;
		this.nbapprenant = nbapprenant;
		this.datenbplace = datenbplace;
	}


	public TypereservationEntity(String nom, int nbapprenant, String datenbplace) {
		super();
		this.nom = nom;
		this.nbapprenant = nbapprenant;
		this.datenbplace = datenbplace;
	}


	public TypereservationEntity(String nom, int nbapprenant) {
		super();
		this.nom = nom;
		this.nbapprenant = nbapprenant;
	}


	
	public int getIdTypereseervtaion() {
		return idTypereseervtaion;
	}

	public void setIdTypereseervtaion(int idTypereseervtaion) {
		this.idTypereseervtaion = idTypereseervtaion;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbapprenant() {
		return nbapprenant;
	}

	public void setNbapprenant(int nbapprenant) {
		this.nbapprenant = nbapprenant;
	}

	public String getDatenbplace() {
		return datenbplace;
	}

	public void setDatenbplace(String datenbplace) {
		this.datenbplace = datenbplace;
	}

//	@OneToMany(mappedBy = "typereservationByIdTypereseervtaion")
//	public Collection<ReservationEntity> getReservations() {
//		return reservations;
//	}
//
//	public void setReservations(Collection<ReservationEntity> reservations) {
//		this.reservations = reservations;
//	}


	@Override
	public String toString() {
		return "TypereservationEntity [idTypereseervtaion=" + idTypereseervtaion + ", nom=" + nom + ", nbapprenant="
				+ nbapprenant + ", datenbplace=" + datenbplace + "]";
	}
	

 
}
