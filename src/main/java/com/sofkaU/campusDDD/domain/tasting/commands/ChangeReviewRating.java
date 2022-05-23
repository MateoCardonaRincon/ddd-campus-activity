package com.sofkaU.campusDDD.domain.tasting.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.values.Rating;

public class ChangeReviewRating extends Command {

    private final TastingId tastingId;
    private final Rating rating;

    public ChangeReviewRating(TastingId tastingId, Rating rating) {
        this.tastingId = tastingId;
        this.rating = rating;
    }

    public TastingId getTastingId() {
        return tastingId;
    }

    public Rating getRating() {
        return rating;
    }
}
