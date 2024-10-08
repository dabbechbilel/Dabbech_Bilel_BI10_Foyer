package tn.esprit.Foyer_BI10.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Foyer_BI10.entites.Etudiant;
import tn.esprit.Foyer_BI10.repositories.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant UpdateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
}
