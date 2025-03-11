package tn.esprit.gestion.service;

import tn.esprit.gestion.entity.Project;

import java.util.List;

public interface IProjectService {

    Project addProjet(Project projet);
    Project updateProjet(Project projet);
    void deleteProjet(long idProjet);
    List<Project> getAll();
    Project getProjet(long idProjet);
}
