package com.sofkaU.campusDDD.domain.tasting.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.tasting.values.DateOfTasting;
import com.sofkaU.campusDDD.domain.tasting.values.PreparationMethod;

public class TastingCreated extends DomainEvent {

    private final DateOfTasting dateOfTasting;
    private final PreparationMethod preparationMethod;

    public TastingCreated(DateOfTasting dateOfTasting, PreparationMethod preparationMethod) {
        super("campusddd.tasting.tastingcreated");
        this.dateOfTasting = dateOfTasting;
        this.preparationMethod = preparationMethod;
    }

    public DateOfTasting getDateOfTasting() {
        return dateOfTasting;
    }

    public PreparationMethod getPreparationMethod() {
        return preparationMethod;
    }
}
