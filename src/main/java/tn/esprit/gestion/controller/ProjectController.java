package tn.esprit.gestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
        private Project retriveProjet(@PathVariable ("id")long id) {
            Project project = projectService.getProjet((long) id);
            return project;
        }
    }

