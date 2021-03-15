package models;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "typereservation")

public class TypereservationEntity implements Serializable{
	private int idTypereseervtaion;
	private String nom;
	private int nbapprenant;
//	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime")
//	@DateTimeFormat(pattern = "dd-MM-yyyy")
//	@Temporal(value= TemporalType.TIMESTAMP)
	@Temporal(TemporalType.TIMESTAMP)
    private Date datenbplace;
//	private Date datenbplace;
	private Collection<ReservationEntity> reservationsByIdTypereseervtaion;
	
	
	
	
	public TypereservationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

//	public TypereservationEntity(String nom, int nbapprenant, Timestamp datenbplace,
//			Collection<ReservationEntity> reservationsByIdTypereseervtaion) {
//		super();
//		this.nom = nom;
//		this.nbapprenant = nbapprenant;
//		this.datenbplace = datenbplace;
//		this.reservationsByIdTypereseervtaion = reservationsByIdTypereseervtaion;
//	}


	public TypereservationEntity(String nom, int nbapprenant) {
		super();
		this.nom = nom;
		this.nbapprenant = nbapprenant;
	}


	@Id
	@GeneratedValue
	@Column(name = "id_typereseervtaion")
	public int getIdTypereseervtaion() {
		return idTypereseervtaion;
	}

	public void setIdTypereseervtaion(int idTypereseervtaion) {
		this.idTypereseervtaion = idTypereseervtaion;
	}

	@Basic
	@Column(name = "nom")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Basic
	@Column(name = "nbapprenant")
	public int getNbapprenant() {
		return nbapprenant;
	}

	public void setNbapprenant(int nbapprenant) {
		this.nbapprenant = nbapprenant;
	}

	@Basic
	@Column(name = "datenbplace")
	public Date getDatenbplace() {
		return datenbplace;
	}

	public void setDatenbplace(Date datenbplace) {
		this.datenbplace = (Timestamp) datenbplace;
	}

	@OneToMany(mappedBy = "typereservationByIdTypereseervtaion")
	public Collection<ReservationEntity> getReservationsByIdTypereseervtaion() {
		return reservationsByIdTypereseervtaion;
	}

	public void setReservationsByIdTypereseervtaion(Collection<ReservationEntity> reservationsByIdTypereseervtaion) {
		this.reservationsByIdTypereseervtaion = reservationsByIdTypereseervtaion;
	}
}
