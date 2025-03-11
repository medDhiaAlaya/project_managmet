package tn.esprit.gestion.service;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestion.entity.Equipe;
import tn.esprit.gestion.entity.Project;
import tn.esprit.gestion.entity.ProjectDetails;
import tn.esprit.gestion.repository.EquipeRepository;
import tn.esprit.gestion.repository.ProjectDetailsRepository;
import tn.esprit.gestion.repository.ProjectRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImplement implements IProjectService {

    @Autowired
    private ProjectRepository projectRepository;
    @Autowired
    private ProjectDetailsRepository projectDetailsRepository;

    @Autowired
    private EquipeRepository equipeRepository;


    @Override
    public Project addProjet(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project updateProjet(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public void deleteProjet(long idProjet) {
         projectRepository.deleteById(idProjet);

    }



    @Override
    public List<Project> getAll() {

        return projectRepository.findAll();
    }

    @Override
    public Project getProjet(long idProjet) {
        return projectRepository.findById(idProjet).get();
    }

    @Override
    public Project addProjectDetailsToProject(long projetId, long projectDetailsId) {
        Project project = projectRepository.findById(projetId).get();
        ProjectDetails projectDetails = projectDetailsRepository.findById(projectDetailsId).get();
        project.setProjectDetails(projectDetails);
        return projectRepository.save(project);
    }

    @Override
    public Equipe affecteProjetAEquipe(List<Long> projetId, long equipeId) {

        List<Project> projects = projectRepository.findAllById(projetId);
        Equipe equipe = equipeRepository.findById(equipeId).get();
        equipe.getProjects().addAll(projects);
        return equipeRepository.save(equipe);
        //project.getEquipes().add(equipe);
        //return equipe;



    }

    @Override
    public Project addProjectAndAffectDetails(long projectDetailsId, Project project) {
        ProjectDetails projectDetails = projectDetailsRepository.findById(projectDetailsId).get();
        projectRepository.save(project);
        project.setProjectDetails(projectDetails);
        return projectRepository.save(project);

    }

    @Override
    public Project disafecterDetailsFromProject(long idProject ) {
        Project project = projectRepository.findById(idProject).get();
        project.setProjectDetails(null);
        return projectRepository.save(project);
    }

    @Override
    public Project removeProjectFromEquipe(long idProject, long equipeId) {

        Project project = projectRepository.findById(equipeId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
        equipe.getProjects().remove(project);
        return projectRepository.save(project);

    }


}
