package tn.esprit.Foyer_BI10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.Foyer_BI10.entites.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository <Etudiant , Long> {
}
