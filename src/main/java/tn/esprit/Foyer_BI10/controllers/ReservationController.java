package tn.esprit.Foyer_BI10.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Foyer_BI10.entites.Reservation;
import tn.esprit.Foyer_BI10.services.iReservationService;

import java.util.List;
@Tag(name ="Gestion Reservation")


@RestController
@RequestMapping("/reservation")
public class ReservationController {
     iReservationService reservationService;



    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @GetMapping("/findAll")
    public List<Reservation> findAll() {
        return reservationService.getAllReservations();
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.UpdateReservation(reservation);
    }

    @DeleteMapping("/deleteReservation/{idReservation}")
    public void deleteReservation(@PathVariable String idReservation) {
        reservationService.deleteReservation(idReservation);
    }
}
