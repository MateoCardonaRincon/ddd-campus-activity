package com.sofkaU.campusDDD.domain.reservation;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.campusDDD.domain.reservation.values.TouristId;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.Name;

import java.util.Objects;

public class Tourist extends Entity<TouristId> {

    private Name name;
    private Age age;

    public Tourist(TouristId entityId, Name name, Age age) {
        super(entityId);
        this.name = name;
        this.age = age;
        this.entityId = entityId;
    }

    public void changeTouristName(Name name) {
        this.name = Objects.requireNonNull(name);
    }

    public void changeTouristAge(Age age) {
        this.age = Objects.requireNonNull(age);
    }

    public Name name() {
        return name;
    }

    public Age age() {
        return age;
    }
}
