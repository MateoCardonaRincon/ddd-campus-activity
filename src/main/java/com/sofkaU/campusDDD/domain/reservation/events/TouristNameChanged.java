package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.shared.values.Name;

public class TouristNameChanged extends DomainEvent {

    private final Name name;

    public TouristNameChanged(Name name) {
        super("campusddd.reservation.touristnamechanged");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
