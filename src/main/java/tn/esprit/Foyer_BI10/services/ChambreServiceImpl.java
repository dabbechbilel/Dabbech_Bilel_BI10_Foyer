package tn.esprit.Foyer_BI10.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Foyer_BI10.entites.Chambre;
import tn.esprit.Foyer_BI10.entites.TypeChambre;
import tn.esprit.Foyer_BI10.repositories.ChambreRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public void deleteChambre(Long idChambre) {
chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre UpdateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre getChambreByID(Long id) {
        return chambreRepository.findById(id).orElse(null); // Return null if not found
    }
    @Override
    public List<Chambre> findByTypeC(TypeChambre typeC) {
        return chambreRepository.findByTypeC(typeC); // Assuming this is the method for type search
    }

    @Override
    public Chambre findNumeroChambre(Long numeroChambre) {
        return chambreRepository.findByNumeroChambre(numeroChambre);
    }

    @Override
    public List<Chambre> getChambreParBlocType(Long idBloc, TypeChambre typeC) {
        return chambreRepository.findByBlocIdBlocAndTypeC(idBloc, typeC);
    }

}
