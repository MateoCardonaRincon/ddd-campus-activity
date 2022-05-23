package com.sofkaU.campusDDD.domain.tasting;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.values.DateOfTasting;
import com.sofkaU.campusDDD.domain.tasting.values.PreparationMethod;

public class Tasting extends AggregateEvent<TastingId> {

    protected DateOfTasting dateOfTasting;
    protected PreparationMethod preparationMethod;
    protected Coffee coffee;
    protected Review review;

    public Tasting(TastingId entityId) {
        super(entityId);
    }
}
