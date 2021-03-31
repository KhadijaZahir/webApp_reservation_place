package org.example.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
//@NamedQuery(query = "SELECT t FROM UTILISATEUR t", name = "UTILISATEUR.All")
public class UtilisateurEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int idUser;
	private String nom;
	private String prenom;
	private String email;
	private int phone;
	private String password;
//	private List<ReservationEntity> reservations;

	@ManyToOne
//	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_role", referencedColumnName = "id_role")
	private RolesEntity role;

	public UtilisateurEntity() {
		super();
	}

	public UtilisateurEntity(int idUser, String nom, String prenom, String email, int phone, String password,
			RolesEntity role) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
	}

	public UtilisateurEntity(String nom, String prenom, String email, String password, int phone) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public UtilisateurEntity(String nom, String prenom, String email, String password, int phone, RolesEntity role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.role = role;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public RolesEntity getRole() {
		return role;
	}

	public void setRole(RolesEntity role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UtilisateurEntity [idUser=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", password=" + password + ", phone=" + phone + ", role=" + role + "]";
	}

//	    @OneToMany(mappedBy = "utilisateurByIdUser")
//	    public Collection<AdministateurEntity> getAdministateursByIdUser() {
//	        return administateursByIdUser;
//	    }

//	    public void setAdministateursByIdUser(Collection<AdministateurEntity> administateursByIdUser) {
//	        this.administateursByIdUser = administateursByIdUser;
//	    }

//	    @OneToMany(mappedBy = "utilisateurByIdUser")
//	    public Collection<ApprenantEntity> getApprenantsByIdUser() {
//	        return apprenantsByIdUser;
//	    }

//	@OneToMany(mappedBy = "utilisateur")
//
//	public List<ReservationEntity> getReservations() {
//		return reservations;
//	}
//
//	public void setReservations(List<ReservationEntity> reservations) {
//		this.reservations = reservations;
//	}

}
