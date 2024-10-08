package tn.esprit.Foyer_BI10.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import tn.esprit.Foyer_BI10.entites.Reservation;

import java.util.List;

public interface iReservationService {
    public Reservation addReservation (Reservation reservation);
    public void deleteReservation(String idReservation);
    public Reservation UpdateReservation(Reservation reservation);
    public  List<Reservation> getAllReservations();
}
