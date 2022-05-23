package com.sofkaU.campusDDD.domain.tasting.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.values.Comment;
import com.sofkaU.campusDDD.domain.tasting.values.Rating;
import com.sofkaU.campusDDD.domain.tasting.values.ReviewId;

public class AddReview extends Command {

    private final TastingId tastingId;
    private final ReviewId reviewId;
    private final Rating rating;
    private final Comment comment;

    public AddReview(TastingId tastingId, ReviewId reviewId, Rating rating, Comment comment) {
        this.tastingId = tastingId;
        this.reviewId = reviewId;
        this.rating = rating;
        this.comment = comment;
    }

    public TastingId getTastingId() {
        return tastingId;
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
