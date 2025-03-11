package tn.esprit.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.gestion.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {


}
