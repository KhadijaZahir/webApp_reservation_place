package org.example.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles")
public class RolesEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role")
	private int idRole;
	
	@Column(name = "role_name")
	private String roleName;
//    private Collection<UtilisateurEntity> utilisateursByIdRole;

	public RolesEntity(String roleName) {
		this.roleName = roleName;
	}

	public RolesEntity() {

	}

	public RolesEntity(int idRole, String roleName) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

//    @OneToMany(mappedBy = "rolesByIdRole")
//    public Collection<UtilisateurEntity> getUtilisateursByIdRole() {
//        return utilisateursByIdRole;
//    }

//    public void setUtilisateursByIdRole(Collection<UtilisateurEntity> utilisateursByIdRole) {
//        this.utilisateursByIdRole = utilisateursByIdRole;
//    }

	@Override
	public String toString() {
		return "RolesEntity [idRole=" + idRole + ", roleName=" + roleName + "]";
	}

}
