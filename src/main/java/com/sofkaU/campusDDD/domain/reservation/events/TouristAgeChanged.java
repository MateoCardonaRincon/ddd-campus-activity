package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.shared.values.Age;

public class TouristAgeChanged extends DomainEvent {
    private final Age age;

    public TouristAgeChanged(Age age) {
        super("campusddd.reservation.touristagechanged");
        this.age = age;
    }

    public Age getAge() {
        return age;
    }
}
