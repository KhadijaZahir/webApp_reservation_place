package models;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Collection;



@Entity
@Table(name = "roles")
public class RolesEntity implements Serializable {
    private int idRole;
    private String roleName;
//    private Collection<UtilisateurEntity> utilisateursByIdRole;

    public RolesEntity(String roleName) {
        this.roleName = roleName;
    }

    public RolesEntity() {

    } 

    @Id
    @GeneratedValue
    @Column(name = "id_role")
    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


//
//    @OneToMany(mappedBy = "rolesByIdRole")
//    public Collection<UtilisateurEntity> getUtilisateursByIdRole() {
//        return utilisateursByIdRole;
//    }
//
//    public void setUtilisateursByIdRole(Collection<UtilisateurEntity> utilisateursByIdRole) {
//        this.utilisateursByIdRole = utilisateursByIdRole;
//    }
}

