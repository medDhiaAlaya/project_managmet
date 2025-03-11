package tn.esprit.gestion.service;

import tn.esprit.gestion.entity.ProjectDetails;

import java.util.List;

public interface IProjectDetailsService {

    ProjectDetails addProjectDetails(ProjectDetails projectDetails);
    ProjectDetails updateProjectDetails(ProjectDetails projectDetails);
    void deleteProjectDetails(long idProjectDetails);
    List<ProjectDetails> getAll();
    ProjectDetails getProjectDetails(long idProjectDetails);
}
