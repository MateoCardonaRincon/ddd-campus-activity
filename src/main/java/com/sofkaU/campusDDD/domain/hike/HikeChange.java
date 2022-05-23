package com.sofkaU.campusDDD.domain.hike;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.campusDDD.domain.hike.events.*;

public class HikeChange extends EventChange {

    public HikeChange(Hike hike) {

        apply((HikeCreated event) -> {
            hike.dateOfHike = event.getDateOfHike();
        });

        apply((ReservationAssociated event) -> {
            hike.reservationId = event.getReservationId();
        });

        apply((DateOfHikeChanged event) -> {
            hike.dateOfHike = event.getDateOfHike();
        });

        apply((GuideAdded event) -> {
            hike.guide = new Guide(
                    event.getGuideId(),
                    event.getName(),
                    event.getAge(),
                    event.getLicense());
        });

        apply((RouteAdded event) -> {
            hike.route = new Route(
                    event.getRouteId(),
                    event.getDescription(),
                    event.getEstimatedDuration());
        });

        apply((GuideNameChanged event) -> {
            hike.guide.changeGuideName(event.getName());
        });

        apply((GuideAgeChanged event) -> {
            hike.guide.changeGuideAge(event.getAge());
        });

        apply((GuideLicenseChanged event) -> {
            hike.guide.changeGuideLicense(event.getLicense());
        });

        apply((RouteDescriptionChanged event) -> {
            hike.route.changeRouteDescription(event.getDescription());
        });

        apply((EstimatedDurationChangedInRoute event) -> {
            hike.route.changeEstimatedDuration(event.getDuration());
        });
    }
}
