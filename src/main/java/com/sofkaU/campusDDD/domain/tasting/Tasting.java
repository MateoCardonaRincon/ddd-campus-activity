package com.sofkaU.campusDDD.domain.tasting;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.shared.values.TastingId;
import com.sofkaU.campusDDD.domain.tasting.events.*;
import com.sofkaU.campusDDD.domain.tasting.values.*;

import java.util.List;
import java.util.Objects;

public class Tasting extends AggregateEvent<TastingId> {

    protected DateOfTasting dateOfTasting;
    protected PreparationMethod preparationMethod;
    protected Coffee coffee;
    protected Review review;

    public Tasting(TastingId entityId, DateOfTasting dateOfTasting, PreparationMethod preparationMethod) {
        super(entityId);
        this.dateOfTasting = dateOfTasting;
        this.preparationMethod = preparationMethod;
        appendChange(new TastingCreated(dateOfTasting, preparationMethod)).apply();
    }

    private Tasting(TastingId tastingId) {
        super(tastingId);
        subscribe(new TastingChange(this));
    }

    public Tasting from(TastingId tastingId, List<DomainEvent> events) {
        Tasting tasting = new Tasting(tastingId);
        events.forEach(tasting::applyEvent);
        return tasting;
    }

    // Behaviors
    public void changeDateOfTasting(DateOfTasting dateOfTasting) {
        Objects.requireNonNull(dateOfTasting);
        appendChange(new DateOfTastingChanged(dateOfTasting)).apply();
    }

    public void changePreparationMethod(PreparationMethod preparationMethod) {
        Objects.requireNonNull(preparationMethod);
        appendChange(new PreparationMethodChanged(preparationMethod)).apply();
    }

    public void addCoffee(CoffeeId coffeeId, GrindingType grindingType, CoffeeProfile coffeeProfile) {
        Objects.requireNonNull(coffeeId);
        Objects.requireNonNull(grindingType);
        Objects.requireNonNull(coffeeProfile);
        appendChange(new CoffeeAdded(coffeeId, grindingType, coffeeProfile)).apply();
    }

    public void addReview(ReviewId reviewId, Rating rating, Comment comment){
        Objects.requireNonNull(reviewId);
        Objects.requireNonNull(rating);
        Objects.requireNonNull(comment);
        appendChange(new ReviewAdded(reviewId, rating, comment)).apply();
    }

    public void changeCoffeeGrindingType(GrindingType grindingType){
        Objects.requireNonNull(grindingType);
        appendChange(new CoffeeGrindingTypeChanged(grindingType)).apply();
    }

    public void changeCoffeeProfile(CoffeeProfile coffeeProfile){
        Objects.requireNonNull(coffeeProfile);
        appendChange(new CoffeeProfileChanged(coffeeProfile)).apply();
    }

    public void changeReviewRating(Rating rating){
        Objects.requireNonNull(rating);
        appendChange(new ReviewRatingChanged(rating)).apply();
    }

    public void changeRevieeComment(Comment comment){
        Objects.requireNonNull(comment);
        appendChange(new ReviewCommentChanged(comment)).apply();
    }

    public DateOfTasting dateOfTasting() {
        return dateOfTasting;
    }

    public PreparationMethod preparationMethod() {
        return preparationMethod;
    }

    public Coffee coffee() {
        return coffee;
    }

    public Review review() {
        return review;
    }
}
