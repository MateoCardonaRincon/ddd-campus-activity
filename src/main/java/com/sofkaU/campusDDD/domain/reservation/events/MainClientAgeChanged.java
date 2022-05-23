package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.shared.values.Age;

public class MainClientAgeChanged extends DomainEvent {
    private final Age age;

    public MainClientAgeChanged(Age age) {
        super("campusddd.reservation.mainclientagechanged");
        this.age = age;
    }

    public Age getAge() {
        return age;
    }
}
