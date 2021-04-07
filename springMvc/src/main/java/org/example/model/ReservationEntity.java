package org.example.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "reservation")
public class ReservationEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reservation")
	private int idReservation;
	private boolean confirmerreservation;
	private String datereservation;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_user", referencedColumnName = "id_user")
	private UtilisateurEntity utilisateur;
//FetchType.LAZY : indique que la relation doit être chargée à la demande
//FetchType.EAGER : indique que la relation doit être chargée en même temps que l'entité qui la porte.
	//Since Eager fetching loads ALL relationships automatically, It's a big performance hog
//Lazy fetching doesn't load any relationships unless told to, which leads to better performance
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_typereseervtaion", referencedColumnName = "id_typereseervtaion")
	private TypereservationEntity typereservationByIdTypereseervtaion;

	public ReservationEntity() {
		super();
	}

	public ReservationEntity(int idReservation, boolean confirmerreservation, String datereservation,
			UtilisateurEntity utilisateur, TypereservationEntity typereservationByIdTypereseervtaion) {
		super();
		this.idReservation = idReservation;
		this.confirmerreservation = confirmerreservation;
		this.datereservation = datereservation;
		this.utilisateur = utilisateur;
		this.typereservationByIdTypereseervtaion = typereservationByIdTypereseervtaion;
	}

	public ReservationEntity(boolean confirmerreservation, String datereservation, UtilisateurEntity utilisateur,
			TypereservationEntity typereservationByIdTypereseervtaion) {
		super();
		this.confirmerreservation = confirmerreservation;
		this.datereservation = datereservation;
		this.utilisateur = utilisateur;
		this.typereservationByIdTypereseervtaion = typereservationByIdTypereseervtaion;
	}

	public ReservationEntity(boolean confirmerreservation) {
		super();
		this.confirmerreservation = confirmerreservation;
	}

	public int getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public boolean isConfirmerreservation() {
		return confirmerreservation;
	}

	public boolean setConfirmerreservation(boolean confirmerreservation) {
		this.confirmerreservation = confirmerreservation;
		return confirmerreservation;
	}

	public String getDatereservation() {
		return datereservation;
	}

	public void setDatereservation(String datereservation) {
		this.datereservation = datereservation;
	}

	public UtilisateurEntity getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurEntity utilisateur) {
		this.utilisateur = utilisateur;
	}

	public TypereservationEntity getTypereservationByIdTypereseervtaion() {
		return typereservationByIdTypereseervtaion;
	}

	public void setTypereservationByIdTypereseervtaion(TypereservationEntity typereservationByIdTypereseervtaion) {
		this.typereservationByIdTypereseervtaion = typereservationByIdTypereseervtaion;
	}

	@Override
	public String toString() {
		return "ReservationEntity [idReservation=" + idReservation + ", confirmerreservation=" + confirmerreservation
				+ ", datereservation=" + datereservation + ", utilisateurByIdUser=" + utilisateur
				+ ", typereservationByIdTypereseervtaion=" + typereservationByIdTypereseervtaion + "]";
	}
}
