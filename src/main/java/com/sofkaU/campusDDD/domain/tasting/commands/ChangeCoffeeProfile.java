package com.sofkaU.campusDDD.domain.tasting.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.values.CoffeeProfile;

public class ChangeCoffeeProfile extends Command {

    private final TastingId tastingId;
    private final CoffeeProfile coffeeProfile;

    public ChangeCoffeeProfile(TastingId tastingId, CoffeeProfile coffeeProfile) {
        this.tastingId = tastingId;
        this.coffeeProfile = coffeeProfile;
    }

    public TastingId getTastingId() {
        return tastingId;
    }

    public CoffeeProfile getCoffeeProfile() {
        return coffeeProfile;
    }
}
