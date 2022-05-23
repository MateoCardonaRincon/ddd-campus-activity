package com.sofkaU.campusDDD.domain.tasting.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.tasting.values.Comment;
import com.sofkaU.campusDDD.domain.tasting.values.Rating;
import com.sofkaU.campusDDD.domain.tasting.values.ReviewId;

public class ReviewAdded extends DomainEvent {

    private final ReviewId reviewId;
    private final Rating rating;
    private final Comment comment;

    public ReviewAdded(ReviewId reviewId, Rating rating, Comment comment) {
        super("campusddd.tasting.reviewadded");
        this.reviewId = reviewId;
        this.rating = rating;
        this.comment = comment;
    }

    public ReviewId getReviewId() {
        return reviewId;
    }

    public Rating getRating() {
        return rating;
    }

    public Comment getComment() {
        return comment;
    }
}
