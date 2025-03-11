package tn.esprit.gestion.service;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestion.entity.Project;
import tn.esprit.gestion.repository.ProjectRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImplement implements IProjectService {

    @Autowired
    private ProjectRepository projectRepository;


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



}
