

package tn.esprit.gestion.controller;


import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion.entity.Equipe;
import tn.esprit.gestion.service.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("/Equipe")
public class EquipeController {
    @Autowired
    IEquipeService equipeService;

    // http://localhost:8089/tpProjet/Equipe/addEquipe
    @PostMapping("/addEquipe")
    Equipe addEquipe(@RequestBody Equipe equipe) {
        return equipeService.addEquipe(equipe);
    }
    // http://localhost:8089/tpProjet/Equipe/updateEquipe
    @PutMapping("/updateEquipe")
    Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeService.updateEquipe(equipe);
    }

    // http://localhost:8089/tpProjet/Equipe/deleteEquipe/1
    @DeleteMapping("/deleteEquipe/{idequipe}")
    void deleteEquipe(@PathVariable long idequipe) {
        equipeService.deleteEquipe(idequipe);
    }

    // http://localhost:8089/tpProjet/Equipe/getEquipes
    @GetMapping("/getEquipes")
    public List<Equipe> retrieveAllEquipes() {
        return equipeService.getAll();
    }
    // http://localhost:8089/tpProjet/Equipe/display/1
    @GetMapping("/display/{id}")
    private Equipe retriveEquipe(@PathVariable ("id")long id) {
        Equipe equipe = equipeService.getEquipe((long) id);
        return equipe ;
    }
}