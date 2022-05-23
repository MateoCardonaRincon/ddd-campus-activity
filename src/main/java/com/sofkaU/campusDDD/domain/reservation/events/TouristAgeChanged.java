package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.reservation.values.TouristId;
import com.sofkaU.campusDDD.domain.shared.values.Age;

public class TouristAgeChanged extends DomainEvent {
    private final TouristId touristId;
    private final Age age;

    public TouristAgeChanged(TouristId touristId, Age age) {
        super("campusddd.reservation.touristagechanged");
        this.touristId = touristId;
        this.age = age;
    }

    public TouristId getTouristId() {
        return touristId;
    }

    public Age getAge() {
        return age;
    }
}
