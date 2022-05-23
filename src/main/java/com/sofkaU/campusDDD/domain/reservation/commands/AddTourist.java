package com.sofkaU.campusDDD.domain.reservation.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.reservation.values.TouristId;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.Name;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

public class AddTourist extends Command {

    private final ReservationId reservationId;
    private final TouristId touristId;
    private final Name name;
    private final Age age;

    public AddTourist(ReservationId reservationId, TouristId touristId, Name name, Age age) {
        this.reservationId = reservationId;
        this.touristId = touristId;
        this.name = name;
        this.age = age;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }

    public TouristId getTouristId() {
        return touristId;
    }

    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }
}
