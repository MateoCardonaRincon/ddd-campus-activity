package com.sofkaU.campusDDD.domain.reservation.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.reservation.values.ReservationDate;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

public class ChangeReservationDate extends Command {

    private final ReservationId reservationId;
    private final ReservationDate reservationDate;

    public ChangeReservationDate(ReservationId reservationId, ReservationDate reservationDate) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }

    public ReservationDate getReservationDate() {
        return reservationDate;
    }
}
