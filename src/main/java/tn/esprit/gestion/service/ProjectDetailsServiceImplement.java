package tn.esprit.gestion.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestion.entity.ProjectDetails;
import tn.esprit.gestion.repository.ProjectDetailsRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectDetailsServiceImplement implements IProjectDetailsService {
    @Autowired
    private ProjectDetailsRepository projectDetailsRepository;


    @Override
    public ProjectDetails addProjectDetails(ProjectDetails projectDetails) {
        return projectDetailsRepository.save(projectDetails);
    }

    @Override
    public ProjectDetails updateProjectDetails(ProjectDetails projectDetails) {
        return projectDetailsRepository.save(projectDetails);
    }

    @Override
    public void deleteProjectDetails(long idProjectDetails) {
        projectDetailsRepository.deleteById(idProjectDetails);

    }


    @Override
    public List<ProjectDetails> getAll() {

        return projectDetailsRepository.findAll();
    }

    @Override
    public ProjectDetails getProjectDetails(long idProjectDetails) {
        return projectDetailsRepository.findById(idProjectDetails).get();
    }


}
