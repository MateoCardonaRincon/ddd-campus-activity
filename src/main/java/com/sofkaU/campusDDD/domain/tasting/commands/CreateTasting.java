package com.sofkaU.campusDDD.domain.tasting.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.values.DateOfTasting;
import com.sofkaU.campusDDD.domain.tasting.values.PreparationMethod;

public class CreateTasting extends Command {

    private final TastingId entityId;
    private final DateOfTasting dateOfTasting;
    private final PreparationMethod preparationMethod;

    public CreateTasting(TastingId entityId, DateOfTasting dateOfTasting, PreparationMethod preparationMethod) {
        this.entityId = entityId;
        this.dateOfTasting = dateOfTasting;
        this.preparationMethod = preparationMethod;
    }

    public TastingId getEntityId() {
        return entityId;
    }

    public DateOfTasting getDateOfTasting() {
        return dateOfTasting;
    }

    public PreparationMethod getPreparationMethod() {
        return preparationMethod;
    }
}
