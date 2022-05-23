package com.sofkaU.campusDDD.domain.tasting.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.tasting.values.CoffeeId;
import com.sofkaU.campusDDD.domain.tasting.values.CoffeeProfile;
import com.sofkaU.campusDDD.domain.tasting.values.GrindingType;

public class CoffeeAdded extends DomainEvent {

    private final CoffeeId coffeeId;
    private final GrindingType grindingType;
    private final CoffeeProfile coffeeProfile;

    public CoffeeAdded(CoffeeId coffeeId, GrindingType grindingType, CoffeeProfile coffeeProfile) {
        super("campusddd.tasting.coffeeadded");
        this.coffeeId = coffeeId;
        this.grindingType = grindingType;
        this.coffeeProfile = coffeeProfile;
    }

    public CoffeeId getCoffeeId() {
        return coffeeId;
    }

    public GrindingType getGrindingType() {
        return grindingType;
    }

    public CoffeeProfile getCoffeeProfile() {
        return coffeeProfile;
    }
}
