package tn.esprit.Foyer_BI10.controllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.Foyer_BI10.entites.Chambre;
import tn.esprit.Foyer_BI10.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {
    IChambreService chambreService;
    @PostMapping("/addChambre")
    Chambre addChambre(@RequestBody Chambre c){
        return chambreService.addChambre(c);
    }
    @GetMapping("/findAll")
    List<Chambre> findAll(){
       return chambreService.getAllChambres();
    }
    @PutMapping("/modifierchambre")
    Chambre modifierChambre(@RequestBody Chambre c){
        Chambre chambre = chambreService.UpdateChambre(c);
        return chambre;
    }
    @DeleteMapping("/deletechambre")
    void deleteChambre(@PathVariable Chambre c){
        chambreService.deleteChambre(c.getIdChambre());
    }
}
