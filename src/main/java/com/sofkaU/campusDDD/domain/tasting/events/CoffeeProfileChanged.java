package com.sofkaU.campusDDD.domain.tasting.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.tasting.values.CoffeeProfile;

public class CoffeeProfileChanged extends DomainEvent {

    private final CoffeeProfile coffeeProfile;

    public CoffeeProfileChanged(CoffeeProfile coffeeProfile) {
        super("campusddd.tasting.coffeeprofilechanged");
        this.coffeeProfile = coffeeProfile;
    }

    public CoffeeProfile getCoffeeProfile() {
        return coffeeProfile;
    }
}
