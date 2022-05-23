package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.reservation.values.ReservationDate;

public class ReservationDateChanged extends DomainEvent {
    private final ReservationDate reservationDate;

    public ReservationDateChanged(ReservationDate reservationDate) {
        super("campusddd.reservation.reservationdatechanged");
        this.reservationDate = reservationDate;
    }

    public ReservationDate getReservationDate() {
        return reservationDate;
    }
}
