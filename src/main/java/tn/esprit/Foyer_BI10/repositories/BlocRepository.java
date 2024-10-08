package tn.esprit.Foyer_BI10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.Foyer_BI10.entites.Bloc;
@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
