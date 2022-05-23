package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.shared.values.Name;

public class MainClientNameChanged extends DomainEvent {
    private final Name name;

    public MainClientNameChanged(Name name) {
        super("campusddd.reservation.mainclientnamechanged");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
