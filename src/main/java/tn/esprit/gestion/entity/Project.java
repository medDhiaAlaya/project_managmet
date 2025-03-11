package tn.esprit.gestion.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Set<Equipe> equipes= new HashSet<>();

    @OneToOne(cascade = CascadeType.ALL)
    private ProjectDetails projectDetails;

}
