package tn.esprit.Foyer_BI10.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Foyer_BI10.entites.Universite;
import tn.esprit.Foyer_BI10.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long idUniversite) {
universiteRepository.deleteById(idUniversite);
    }

    @Override
    public Universite UpdateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }
}
