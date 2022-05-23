package com.sofkaU.campusDDD.domain.reservation.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

public class ChangeMainClientAge extends Command {

    private final ReservationId reservationId;
    private final Age age;

    public ChangeMainClientAge(ReservationId reservationId, Age age) {
        this.reservationId = reservationId;
        this.age = age;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }

    public Age getAge() {
        return age;
    }
}
