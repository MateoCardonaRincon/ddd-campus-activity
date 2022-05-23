package com.sofkaU.campusDDD.domain.tasting.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.tasting.values.PreparationMethod;

public class PreparationMethodChanged extends DomainEvent {

    private final PreparationMethod preparationMethod;

    public PreparationMethodChanged(PreparationMethod preparationMethod) {
        super("campusddd.tasting.preparationmethod changed");
        this.preparationMethod = preparationMethod;
    }

    public PreparationMethod getPreparationMethod() {
        return preparationMethod;
    }
}
