package tn.esprit.gestion.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestion.entity.Equipe;
import tn.esprit.gestion.repository.EquipeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeServiceImplement implements IEquipeService {

    @Autowired
    private EquipeRepository equipeRepository;


    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void deleteEquipe(long idEquipe) {
        equipeRepository.deleteById(idEquipe);

    }


    @Override
    public List<Equipe> getAll() {

        return equipeRepository.findAll();
    }

    @Override
    public Equipe getEquipe(long idEquipe) {
        return equipeRepository.findById(idEquipe).get();
    }


}
