package com.sofkaU.campusDDD.domain.tasting.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.tasting.values.DateOfTasting;

public class DateOfTastingChanged extends DomainEvent {

    private final DateOfTasting dateOfTasting;

    public DateOfTastingChanged(DateOfTasting dateOfTasting) {
        super("campusddd.tasting.dateoftastingchanged");
        this.dateOfTasting = dateOfTasting;
    }

    public DateOfTasting getDateOfTasting() {
        return dateOfTasting;
    }
}
