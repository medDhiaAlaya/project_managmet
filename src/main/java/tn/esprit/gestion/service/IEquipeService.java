package tn.esprit.gestion.service;

import tn.esprit.gestion.entity.Equipe;

import java.util.List;

public interface IEquipeService {
    Equipe addEquipe(Equipe equipe);
    Equipe updateEquipe(Equipe equipe);
    void deleteEquipe(long idEquipe);
    List<Equipe> getAll();
    Equipe getEquipe(long idEquipe);
}
