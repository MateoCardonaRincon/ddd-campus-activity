package com.sofkaU.campusDDD.domain.reservation.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.reservation.values.Email;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

public class ChangeMainClientEmail extends Command {

    private final ReservationId reservationId;
    private final Email email;

    public ChangeMainClientEmail(ReservationId reservationId, Email email) {
        this.reservationId = reservationId;
        this.email = email;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }

    public Email getEmail() {
        return email;
    }
}
