package com.sofkaU.campusDDD.domain.tasting.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.tasting.values.GrindingType;

public class CoffeeGrindingTypeChanged extends DomainEvent {

    private final GrindingType grindingType;

    public CoffeeGrindingTypeChanged(GrindingType grindingType) {
        super("campusddd.tasting.coffeegrindingtypechanged");
        this.grindingType = grindingType;
    }

    public GrindingType getGrindingType() {
        return grindingType;
    }
}
