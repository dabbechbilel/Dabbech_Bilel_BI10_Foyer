package tn.esprit.Foyer_BI10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.Foyer_BI10.entites.Chambre;
import tn.esprit.Foyer_BI10.entites.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {

        List<Chambre> findByTypeC(TypeChambre tc); // Updated method name

        Chambre findByNumeroChambre(Long numeroChambre); // This is fine

        List<Chambre> findByBlocIdBlocAndTypeC(Long idBloc, TypeChambre typeC);
}
