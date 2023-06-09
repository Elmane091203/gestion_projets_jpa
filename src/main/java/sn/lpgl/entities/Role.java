package sn.lpgl.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role_tb")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idR;

    @Column(name = "nom", unique = true)
    private String nomR;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}
