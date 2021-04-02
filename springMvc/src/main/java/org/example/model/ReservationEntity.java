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

	@ManyToOne
//	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_user", referencedColumnName = "id_user")
	private UtilisateurEntity utilisateur;

//	@ManyToOne(cascade = CascadeType.ALL)
	@ManyToOne
	@JoinColumn(name = "id_typereseervtaion", referencedColumnName = "id_typereseervtaion")
	private TypereservationEntity typereservationByIdTypereseervtaion;

	public ReservationEntity() {
		super();
		// TODO Auto-generated constructor stub
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

	public void setConfirmerreservation(boolean confirmerreservation) {
		this.confirmerreservation = confirmerreservation;
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
