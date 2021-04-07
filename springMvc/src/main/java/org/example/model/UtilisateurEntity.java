package org.example.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
public class UtilisateurEntity implements Serializable {
	@Id
	//La génération de la clé primaire se fera à partir d’une Identité propre au SGBD
	//Strategy = GenerationType.AUTO = La génération de la clé primaire est laissée à l’implémentation
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int idUser;
	private String nom;
	private String prenom;
	@Column(unique = true, nullable = false)
	private String email;
	private String phone;
	private String password;
	private Boolean confirmation;

	@ManyToOne
	@JoinColumn(name = "id_role", referencedColumnName = "id_role")
	private RolesEntity role;
	public UtilisateurEntity() {
		super();
	}

	public UtilisateurEntity(int idUser, String nom, String prenom, String email, String phone, String password,
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

	public UtilisateurEntity(String nom, String prenom, String email, String password, String phone) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public UtilisateurEntity(String nom, String prenom, String email, String password, String phone, RolesEntity role) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public RolesEntity getRole() {
		return role;
	}

	public void setRole(RolesEntity role) {
		this.role = role;
	}

	public Boolean getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(Boolean confirmation) {
		this.confirmation = confirmation;
	}

	@Override
	public String toString() {
		return "UtilisateurEntity [idUser=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", password=" + password + ", phone=" + phone + ", role=" + role + "]";
	}

}
