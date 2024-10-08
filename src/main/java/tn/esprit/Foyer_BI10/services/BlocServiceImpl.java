package tn.esprit.Foyer_BI10.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Foyer_BI10.entites.Bloc;
import tn.esprit.Foyer_BI10.entites.Chambre;
import tn.esprit.Foyer_BI10.repositories.BlocRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {
    BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);

    }

    @Override
    public Bloc UpdateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }
}
