package com.sofkaU.campusDDD.domain.tasting;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.campusDDD.domain.tasting.values.Comment;
import com.sofkaU.campusDDD.domain.tasting.values.Rating;
import com.sofkaU.campusDDD.domain.tasting.values.ReviewId;

import java.util.Objects;

public class Review extends Entity<ReviewId> {

    private Rating rating;
    private Comment comment;

    public Review(ReviewId entityId, Rating rating, Comment comment) {
        super(entityId);
        this.rating = rating;
        this.comment = comment;
    }

    public void changeReviewRating(Rating rating){
        this.rating = Objects.requireNonNull(rating);
    }

    public void changeReviewComment(Comment comment){
        this.comment = Objects.requireNonNull(Review.this.comment);
    }

    public Rating rating() {
        return rating;
    }

    public Comment comment() {
        return comment;
    }
}
