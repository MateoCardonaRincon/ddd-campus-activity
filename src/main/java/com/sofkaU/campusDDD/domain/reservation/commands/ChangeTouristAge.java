package com.sofkaU.campusDDD.domain.reservation.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.reservation.values.TouristId;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

public class ChangeTouristAge extends Command {

    private final ReservationId reservationId;
    private final TouristId touristId;
    private final Age age;

    public ChangeTouristAge(ReservationId reservationId, TouristId touristId, Age age) {
        this.reservationId = reservationId;
        this.touristId = touristId;
        this.age = age;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }

    public TouristId getTouristId() {
        return touristId;
    }

    public Age getAge() {
        return age;
    }
}
