package com.sofkaU.campusDDD.domain.reservation;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.campusDDD.domain.reservation.events.*;
import com.sofkaU.campusDDD.domain.tasting.TastingChange;

import java.util.ArrayList;
import java.util.Objects;

public class ReservationChange extends EventChange {

    public ReservationChange(Reservation reservation) {

        apply((ReservationCreated event) -> {
            reservation.reservationDate = event.getReservationDate();
            reservation.tourists = new ArrayList<>();
        });

        apply((ReservationDateChanged event) -> {
            reservation.reservationDate = event.getReservationDate();
        });

        apply((TouristAdded event) -> {
            reservation.tourists.add(new Tourist(
                    event.getTouristId(),
                    event.getName(),
                    event.getAge()));
        });

        apply((MainClientAdded event) -> {
            reservation.mainClient = new MainClient(
                    event.getMainClientId(),
                    event.getName(),
                    event.getAge(),
                    event.getEmail());
        });

        apply((TouristNameChanged event) -> {
            var tourist = reservation.getTouristById(event.getTouristId())
                    .orElseThrow(() ->
                            new IllegalArgumentException("No tourist with the specified id was found"));
            tourist.changeTouristName(event.getName());
        });

        apply((TouristAgeChanged event) -> {
            var tourist = reservation.getTouristById(event.getTouristId())
                    .orElseThrow(() ->
                            new IllegalArgumentException("No tourist with the specified id was found"));
            tourist.changeTouristAge(event.getAge());
        });

        apply((MainClientNameChanged event) -> {
            Objects.requireNonNull(reservation.mainClient);
            reservation.mainClient.changeMainClientName(event.getName());
        });

        apply((MainClientAgeChanged event) -> {
            Objects.requireNonNull(reservation.mainClient);
            reservation.mainClient.changeMainClientAge(event.getAge());
        });

        apply((MainClientEmailChanged event) -> {
            Objects.requireNonNull(reservation.mainClient);
            reservation.mainClient.changeMainClientEmail(event.getEmail());
        });
    }
}
