package tn.esprit.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.gestion.entity.ProjectDetails;


@Repository
public interface ProjectDetailsRepository extends JpaRepository<ProjectDetails, Long> {
}
