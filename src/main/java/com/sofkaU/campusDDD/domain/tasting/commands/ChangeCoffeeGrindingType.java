package com.sofkaU.campusDDD.domain.tasting.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.values.GrindingType;

public class ChangeCoffeeGrindingType extends Command {

    private final TastingId tastingId;
    private final GrindingType grindingType;

    public ChangeCoffeeGrindingType(TastingId tastingId, GrindingType grindingType) {
        this.tastingId = tastingId;
        this.grindingType = grindingType;
    }

    public TastingId getTastingId() {
        return tastingId;
    }

    public GrindingType getGrindingType() {
        return grindingType;
    }
}
