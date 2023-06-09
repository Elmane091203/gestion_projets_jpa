package sn.lpgl.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idU;

    @Column(name = "nom", length = 200)
    private String nom;

    @Column(name = "prenom", length = 200)
    private String prenom;

    @Column(name = "email",unique = true, length = 200)
    private String email;

    @Column(name = "password", length = 200)
    private String password;

    @ManyToMany
    @JoinTable(
            name = "otaku",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    @OneToMany(mappedBy = "user")
    private List<Projet> projets;
}
