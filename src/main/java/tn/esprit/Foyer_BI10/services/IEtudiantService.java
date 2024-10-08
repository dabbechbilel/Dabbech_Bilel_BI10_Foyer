package tn.esprit.Foyer_BI10.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.Foyer_BI10.entites.Chambre;
import tn.esprit.Foyer_BI10.entites.Etudiant;

import java.util.List;


public interface IEtudiantService {
    public Etudiant addEtudiant (Etudiant etudiant);
    public void deleteEtudiant (Long idEtudiant);
    public Etudiant UpdateEtudiant(Etudiant etudiant);
    public List<Etudiant> getAllEtudiants();
}
