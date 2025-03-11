package tn.esprit.gestion.entity;
import lombok.*;
import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProjectDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjectDetails;
    private String description;
    private String technologie;
    private Long cout;
    private Date dateDebut;


    @OneToOne(mappedBy = "projectDetails")
    private Project project;




}


