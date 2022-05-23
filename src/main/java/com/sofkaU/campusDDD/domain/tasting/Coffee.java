package com.sofkaU.campusDDD.domain.tasting;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.campusDDD.domain.tasting.values.CoffeeId;
import com.sofkaU.campusDDD.domain.tasting.values.CoffeeProfile;
import com.sofkaU.campusDDD.domain.tasting.values.GrindingType;

import java.util.Objects;

public class Coffee extends Entity<CoffeeId> {

    private GrindingType grindingType;
    private CoffeeProfile profile;

    public Coffee(CoffeeId entityId, GrindingType grindingType, CoffeeProfile profile) {
        super(entityId);
        this.grindingType = grindingType;
        this.profile = profile;
    }

    public void changeCoffeeGrindingType(GrindingType grindingType){
        this.grindingType = Objects.requireNonNull(grindingType);
    }

    public void changeCoffeeProfile(CoffeeProfile coffeeProfile){
        this.profile = Objects.requireNonNull(coffeeProfile);
    }

    public GrindingType grindingType() {
        return grindingType;
    }

    public CoffeeProfile profile() {
        return profile;
    }
}
