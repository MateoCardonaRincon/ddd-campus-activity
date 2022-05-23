package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.reservation.values.TouristId;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.Name;

public class TouristAdded extends DomainEvent {
    private final TouristId touristId;
    private final Name name;
    private final Age age;

    public TouristAdded(TouristId touristId, Name name, Age age) {
        super("campusddd.reservation.touristadded");
        this.touristId = touristId;
        this.name = name;
        this.age = age;
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
