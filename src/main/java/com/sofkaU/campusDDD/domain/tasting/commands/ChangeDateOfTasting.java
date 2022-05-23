package com.sofkaU.campusDDD.domain.tasting.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.values.DateOfTasting;

public class ChangeDateOfTasting extends Command {

    private final TastingId tastingId;
    private final DateOfTasting dateOfTasting;

    public ChangeDateOfTasting(TastingId tastingId, DateOfTasting dateOfTasting) {
        this.tastingId = tastingId;
        this.dateOfTasting = dateOfTasting;
    }

    public TastingId getTastingId() {
        return tastingId;
    }

    public DateOfTasting getDateOfTasting() {
        return dateOfTasting;
    }
}
