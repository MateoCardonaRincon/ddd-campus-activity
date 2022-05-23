package com.sofkaU.campusDDD.domain.reservation.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.reservation.values.ReservationDate;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

public class CreateReservation extends Command {

    private final ReservationId entityId;
    private final ReservationDate reservationDate;

    public CreateReservation(ReservationId entityId, ReservationDate reservationDate) {
        this.entityId = entityId;
        this.reservationDate = reservationDate;
    }

    public ReservationId getEntityId() {
        return entityId;
    }

    public ReservationDate getReservationDate() {
        return reservationDate;
    }
}
