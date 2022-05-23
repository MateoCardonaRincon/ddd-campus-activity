package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.reservation.values.Email;
import com.sofkaU.campusDDD.domain.reservation.values.MainClientId;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.Name;

public class MainClientAdded extends DomainEvent {
    private final MainClientId mainClientId;
    private final Name name;
    private final Age age;
    private final Email email;

    public MainClientAdded(MainClientId mainClientId, Name name, Age age, Email email) {
        super("campusddd.reservation.mainclientadded");
        this.mainClientId = mainClientId;
        this.name = name;
        this.age = age;
        this.email = email;
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
