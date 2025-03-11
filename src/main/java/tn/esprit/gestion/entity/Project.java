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

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProject;
    private String sujet;


    @ManyToMany(mappedBy = "projects")
    private Set<Equipe> equipes= new HashSet<>();

    @OneToOne
    private ProjectDetails projectDetails;

}
