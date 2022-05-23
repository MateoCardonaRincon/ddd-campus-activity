package com.sofkaU.campusDDD.domain.tasting.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.tasting.values.Rating;

public class ReviewRatingChanged extends DomainEvent {

    private final Rating rating;

    public ReviewRatingChanged(Rating rating) {
        super("campusddd.tasting.reviewratingchanged");
        this.rating = rating;
    }

    public Rating getRating() {
        return rating;
    }
}
