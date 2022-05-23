package com.sofkaU.campusDDD.domain.reservation.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.reservation.values.TouristId;
import com.sofkaU.campusDDD.domain.shared.values.Name;

public class TouristNameChanged extends DomainEvent {

    private final TouristId touristId;
    private final Name name;

    public TouristNameChanged(TouristId touristId, Name name) {
        super("campusddd.reservation.touristnamechanged");
        this.touristId = touristId;
        this.name = name;
    }

    public TouristId getTouristId() {
        return touristId;
    }

    public Name getName() {
        return name;
    }
}
