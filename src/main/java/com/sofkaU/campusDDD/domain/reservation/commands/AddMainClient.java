package com.sofkaU.campusDDD.domain.reservation.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.reservation.values.Email;
import com.sofkaU.campusDDD.domain.reservation.values.MainClientId;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.Name;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

public class AddMainClient extends Command {
    private final ReservationId reservationId;
    private final MainClientId mainClientId;
    private final Name name;
    private final Age age;
    private final Email email;

    public AddMainClient(ReservationId reservationId, MainClientId mainClientId, Name name, Age age, Email email) {
        this.reservationId = reservationId;
        this.mainClientId = mainClientId;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }

    public MainClientId getMainClientId() {
        return mainClientId;
    }

    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public Email getEmail() {
        return email;
    }
}
