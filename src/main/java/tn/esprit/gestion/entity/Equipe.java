package tn.esprit.gestion.entity;

import lombok.*;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;


    @ManyToMany
    private Set<Project> projects= new HashSet<>();
}
