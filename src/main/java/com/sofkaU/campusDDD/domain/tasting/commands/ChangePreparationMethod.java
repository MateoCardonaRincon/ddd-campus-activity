package com.sofkaU.campusDDD.domain.tasting.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.values.PreparationMethod;

public class ChangePreparationMethod extends Command {

    private final TastingId tastingId;
    private final PreparationMethod preparationMethod;

    public ChangePreparationMethod(TastingId tastingId, PreparationMethod preparationMethod) {
        this.tastingId = tastingId;
        this.preparationMethod = preparationMethod;
    }

    public TastingId getTastingId() {
        return tastingId;
    }

    public PreparationMethod getPreparationMethod() {
        return preparationMethod;
    }
}
