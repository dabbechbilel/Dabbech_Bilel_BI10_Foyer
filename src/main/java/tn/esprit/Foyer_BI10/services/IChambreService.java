package tn.esprit.Foyer_BI10.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.Foyer_BI10.entites.Chambre;

import java.util.List;

public interface IChambreService {
     public Chambre addChambre (Chambre chambre);
     public void deleteChambre (Long idChambre);
     public Chambre UpdateChambre(Chambre chambre);
     public List<Chambre> getAllChambres();
}
