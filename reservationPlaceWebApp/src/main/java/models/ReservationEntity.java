package models;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class ReservationEntity implements Serializable {

	private long idReservation;
	private boolean confirmerreservation;
	private Timestamp datereservation;
//	private Date datereservation;
//	private UtilisateurEntity utilisateurByIdUser;

	@ManyToOne
	@JoinColumn(name = "id_typereseervtaion", referencedColumnName = "id_typereseervtaion")
	private TypereservationEntity typereservationByIdTypereseervtaion;

	public ReservationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReservationEntity(boolean confirmerreservation, DateTime datereservation,
			TypereservationEntity typereservationByIdTypereseervtaion) {
		super();
		this.confirmerreservation = confirmerreservation;
		this.typereservationByIdTypereseervtaion = typereservationByIdTypereseervtaion;
	}

	public ReservationEntity(boolean confirmerreservation) {
		super();
		this.confirmerreservation = confirmerreservation;
	}

	@Id
	@GeneratedValue
	@Column(name = "id_reservation")
	public long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}

	@Basic
	@Column(name = "confirmerreservation")
	public boolean isConfirmerreservation() {
		return confirmerreservation;
	}

	public void setConfirmerreservation(boolean confirmerreservation) {
		this.confirmerreservation = confirmerreservation;
	}

	@Basic
	@Column(name = "datereservation")
	public Timestamp getDatereservation() {
		return datereservation;
	}

	public void setDatereservation(Timestamp datereservation) {
		this.datereservation = datereservation;
	}

//	@ManyToOne
//	@JoinColumn(name = "id_user", referencedColumnName = "id_user")
//	public UtilisateurEntity getUtilisateurByIdUser() {
//		return utilisateurByIdUser;
//	}

//	public void setUtilisateurByIdUser(UtilisateurEntity utilisateurByIdUser) {
//		this.utilisateurByIdUser = utilisateurByIdUser;
//	}

	public TypereservationEntity getTypereservationByIdTypereseervtaion() {
		return typereservationByIdTypereseervtaion;
	}

	public void setTypereservationByIdTypereseervtaion(TypereservationEntity typereservationByIdTypereseervtaion) {
		this.typereservationByIdTypereseervtaion = typereservationByIdTypereseervtaion;
	}
}
