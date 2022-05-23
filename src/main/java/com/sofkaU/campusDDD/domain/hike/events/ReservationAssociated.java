package com.sofkaU.campusDDD.domain.hike.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

public class ReservationAssociated extends DomainEvent {

    private final ReservationId reservationId;

    public ReservationAssociated(ReservationId reservationId) {
        super("campusddd.hike.reservationassociated");
        this.reservationId = reservationId;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }
}
