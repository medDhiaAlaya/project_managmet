package tn.esprit.gestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion.entity.Equipe;
import tn.esprit.gestion.entity.Project;
import tn.esprit.gestion.service.IProjectService;

import java.util.List;


@RestController
@RequestMapping("/Project")
public class ProjectController {
    @Autowired
    IProjectService projectService;

    // http://localhost:8089/tpProjet/Projet/addprojet
    @PostMapping("/addprojet")
    Project addProjet(@RequestBody Project project) {
        return projectService.addProjet(project);
    }

    // http://localhost:8089/tpProjet/Projet/updateproject
    @PutMapping("/updateproject")
    Project updateProjet(@RequestBody Project project) {
        return projectService.updateProjet(project);
    }

    // http://localhost:8089/tpProjet/Projet/deleteProjet/1
    @DeleteMapping("/deleteProjet/{idProjet}")
    void deleteProjet(@PathVariable long idProjet) {
        projectService.deleteProjet(idProjet);
    }

    // http://localhost:8089/tpProjet/Projet/getProjets
    @GetMapping("/getProjets")
    public List<Project> retrieveAllProjets() {
        return projectService.getAll();
    }

    // http://localhost:8089/tpProjet/Projet/display/1
    @GetMapping("/display/{id}")
    private Project retriveProjet(@PathVariable("id") long id) {
        Project project = projectService.getProjet((long) id);
        return project;
    }

    @PutMapping("/addProjectDetailsToProject/{projectId}/{projectDetailsId}")
    private Project addProjectDetailsToProject(@PathVariable long projectId, @PathVariable long projectDetailsId) {
        return projectService.addProjectDetailsToProject(
                projectId, projectDetailsId
        );
    }

    @PutMapping("/affecteProjetAEquipe/{projectId}/{equipeId}")
    private Equipe affecteProjetAEquipe(@PathVariable List<Long> projectId, @PathVariable long equipeId) {
        return projectService.affecteProjetAEquipe(
                projectId, equipeId
        );
    }

    @PostMapping("/addProjectAndAffectDetails/{projectDetailsId}")
    private Project addProjectAndAffectDetails(@PathVariable long projectDetailsId, @RequestBody Project project) {
        return projectService.addProjectAndAffectDetails(
                projectDetailsId, project
        );


    }

    @PutMapping("/disafecterDetailsFromProject/{idProject}")
    private Project disafecterDetailsFromProject(@PathVariable long idProject) {
        return projectService.disafecterDetailsFromProject(idProject);
    }




    @PutMapping("/removeProjectFromEquipe/{idProject}/{idEquipe}")
    private Project removeProjectFromEquipe(@PathVariable long idProject,@PathVariable long idEquipe) {
        return projectService.removeProjectFromEquipe(
                idProject, idEquipe);
    }
}
