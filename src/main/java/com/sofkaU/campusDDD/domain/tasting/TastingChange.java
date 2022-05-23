package com.sofkaU.campusDDD.domain.tasting;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.campusDDD.domain.tasting.events.*;

import java.util.Objects;

public class TastingChange extends EventChange {

    public TastingChange(Tasting tasting) {

        apply((TastingCreated event)->{
            tasting.dateOfTasting = event.getDateOfTasting();
            tasting.preparationMethod = event.getPreparationMethod();
        });

        apply((DateOfTastingChanged event)->{
            tasting.dateOfTasting = event.getDateOfTasting();
        });

        apply((PreparationMethodChanged event)->{
            tasting.preparationMethod = event.getPreparationMethod();
        });

        apply((CoffeeAdded event)->{
            tasting.coffee = new Coffee(
                    event.getCoffeeId(),
                    event.getGrindingType(),
                    event.getCoffeeProfile());
        });

        apply((ReviewAdded event)->{
            tasting.review = new Review(
                    event.getReviewId(),
                    event.getRating(),
                    event.getComment());
        });

        apply((CoffeeGrindingTypeChanged event)->{
            Objects.requireNonNull(tasting.coffee);
            tasting.coffee.changeCoffeeGrindingType(event.getGrindingType());
        });

        apply((CoffeeProfileChanged event)->{
            Objects.requireNonNull(tasting.coffee);
            tasting.coffee.changeCoffeeProfile(event.getCoffeeProfile());
        });

        apply((ReviewRatingChanged event)->{
            Objects.requireNonNull(tasting.review);
            tasting.review.changeReviewRating(event.getRating());
        });

        apply((ReviewCommentChanged event)->{
            Objects.requireNonNull(tasting.review);
            tasting.review.changeReviewComment(event.getComment());
        });
    }
}
