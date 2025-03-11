package tn.esprit.gestion.service;

import tn.esprit.gestion.entity.Equipe;
import tn.esprit.gestion.entity.Project;

import java.util.List;

public interface IProjectService {

    Project addProjet(Project projet);
    Project updateProjet(Project projet);
    void deleteProjet(long idProjet);
    List<Project> getAll();
    Project getProjet(long idProjet);
    Project addProjectDetailsToProject(long projetId, long projectDetailsId);
    Equipe affecteProjetAEquipe (List<Long> projetId, long equipeId);
    Project addProjectAndAffectDetails (long projectDetailsId,Project project);
    Project disafecterDetailsFromProject(long idProject );
    Project removeProjectFromEquipe(long idProject , long equipeId );

}
