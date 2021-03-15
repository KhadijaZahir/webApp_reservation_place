package models;
import javax.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
public class UtilisateurEntity implements Serializable{
	 private long idUser;
	    private String nom;
	    private String prenom;
	    private String email;
	    private String password;
	    private int phone;
//	    private Collection<ApprenantEntity> apprenantsByIdUser;
	
	    @ManyToOne
	    @JoinColumn(name = "id_role", referencedColumnName = "id_role")
	    private RolesEntity rolesByIdRole;

	    public UtilisateurEntity(String nom, String prenom, String email, String password, int phone) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.email = email;
	        this.password = password;
	        this.phone = phone;
	    }

	    public UtilisateurEntity(String nom, String prenom, String email, String password, int phone, RolesEntity rolesByIdRole) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.email = email;
	        this.password = password;
	        this.phone = phone;
	        this.rolesByIdRole = rolesByIdRole;
	    }

	    public UtilisateurEntity() {

	    }

	    @Id
	    @GeneratedValue

	    @Column(name = "id_user")
	    public long getIdUser() {
	        return idUser;
	    }

	    public void setIdUser(long idUser) {
	        this.idUser = idUser;
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
	    @Column(name = "prenom")
	    public String getPrenom() {
	        return prenom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	    @Basic
	    @Column(name = "email")
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    @Basic
	    @Column(name = "password")
	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    @Basic
	    @Column(name = "phone")
	    public int getPhone() {
	        return phone;
	    }

	    public void setPhone(int phone) {
	        this.phone = phone;
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


//	    @OneToMany(mappedBy = "utilisateurByIdUser")
//	    public Collection<ReservationEntity> getReservationsByIdUser() {
//	        return reservationsByIdUser;
//	    }

//	    public void setReservationsByIdUser(Collection<ReservationEntity> reservationsByIdUser) {
//	        this.reservationsByIdUser = reservationsByIdUser;
//	    }

	    
	    public RolesEntity getRolesByIdRole() {
	        return rolesByIdRole;
	    }

	    public void setRolesByIdRole(RolesEntity rolesByIdRole) {
	        this.rolesByIdRole = rolesByIdRole;
	    }
	}

	    


