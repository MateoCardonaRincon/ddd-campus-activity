package com.sofkaU.campusDDD.domain.tasting.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.values.CoffeeId;
import com.sofkaU.campusDDD.domain.tasting.values.CoffeeProfile;
import com.sofkaU.campusDDD.domain.tasting.values.GrindingType;

public class AddCoffee extends Command {

    private final TastingId tastingId;
    private final CoffeeId coffeeId;
    private final GrindingType grindingType;
    private final CoffeeProfile coffeeProfile;

    public AddCoffee(TastingId tastingId, CoffeeId coffeeId, GrindingType grindingType, CoffeeProfile coffeeProfile) {
        this.tastingId = tastingId;
        this.coffeeId = coffeeId;
        this.grindingType = grindingType;
        this.coffeeProfile = coffeeProfile;
    }

    public TastingId getTastingId() {
        return tastingId;
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
