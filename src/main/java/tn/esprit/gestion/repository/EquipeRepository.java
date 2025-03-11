package tn.esprit.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.gestion.entity.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long>  {
}
