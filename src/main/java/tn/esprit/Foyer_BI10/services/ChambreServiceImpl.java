package tn.esprit.Foyer_BI10.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Foyer_BI10.entites.Chambre;
import tn.esprit.Foyer_BI10.repositories.ChambreRepository;

import java.util.List;
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
}
