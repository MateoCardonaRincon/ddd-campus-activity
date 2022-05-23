package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.reservation.values.ReservationDate;

public class ReservationCreated extends DomainEvent {

    private final ReservationDate reservationDate;

    public ReservationCreated(ReservationDate reservationDate) {
        super("campusddd.reservation.reservationcreated");
        this.reservationDate = reservationDate;
    }

    public ReservationDate getReservationDate() {
        return reservationDate;
    }
}
