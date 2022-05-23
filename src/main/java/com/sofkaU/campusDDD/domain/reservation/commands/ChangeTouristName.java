package com.sofkaU.campusDDD.domain.reservation.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.Name;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

public class ChangeTouristName extends Command {

    private final ReservationId reservationId;
    private final Name name;

    public ChangeTouristName(ReservationId reservationId, Name name) {
        this.reservationId = reservationId;
        this.name = name;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }

    public Name getName() {
        return name;
    }
}
