package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.reservation.values.Email;

public class MainClientEmailChanged extends DomainEvent {
    private final Email email;

    public MainClientEmailChanged(Email email) {
        super("campusddd.reservation.mainclientemailchanged");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
