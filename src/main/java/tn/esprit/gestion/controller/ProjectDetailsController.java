package tn.esprit.gestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion.entity.ProjectDetails;
import tn.esprit.gestion.service.IProjectDetailsService;

import java.util.List;

@RestController
@RequestMapping("/ProjetDetail")
public class ProjectDetailsController {
    @Autowired
    IProjectDetailsService projetDetailService;

    // http://localhost:8089/tpProjet/ProjetDetail/addprojetdetail
    @PostMapping("/addprojetdetail")
    ProjectDetails addProjet(@RequestBody ProjectDetails projet) {
        return projetDetailService.addProjectDetails(projet);
    }
    // http://localhost:8089/tpProjet/ProjectDetails/updateprojetdetail
    @PutMapping("/updateprojetdetail")
    ProjectDetails updateProjet(@RequestBody ProjectDetails projet) {
        return projetDetailService.updateProjectDetails(projet);
    }

    // http://localhost:8089/tpProjet/ProjectDetails/deleteProjetdetail/1
    @DeleteMapping("/deleteProjetdetail/{idProjetdetail}")
    void deleteProjet(@PathVariable long idProjetdetail) {
        projetDetailService.deleteProjectDetails(idProjetdetail);
    }

    // http://localhost:8089/tpProjet/ProjectDetails/getProjetsdetail
    @GetMapping("/getProjetsdetail")
    public List<ProjectDetails> retrieveAllProjets() {
        return projetDetailService.getAll();
    }
    // http://localhost:8089/tpProjet/ProjectDetails/display/1
    @GetMapping("/display/{id}")
    private ProjectDetails retriveProjet(@PathVariable ("id")long id) {
        ProjectDetails projet = projetDetailService.getProjectDetails((long) id);
        return projet;
    }
}