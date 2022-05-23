package com.sofkaU.campusDDD.domain.hike;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.hike.events.*;
import com.sofkaU.campusDDD.domain.hike.values.*;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;
import com.sofkaU.campusDDD.domain.shared.values.Name;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

import java.util.List;
import java.util.Objects;

public class Hike extends AggregateEvent<HikeId> {

    protected DateOfHike dateOfHike;
    protected Guide guide;
    protected Route route;
    protected ReservationId reservationId;

    public Hike(HikeId entityId, DateOfHike dateOfHike) {
        super(entityId);
        appendChange(new HikeCreated(dateOfHike)).apply();
    }

    private Hike(HikeId hikeId) {
        super(hikeId);
        subscribe(new HikeChange(this));
    }

    public Hike from(HikeId hikeId, List<DomainEvent> events) {
        Hike hike = new Hike(hikeId);
        events.forEach(hike::applyEvent);
        return hike;
    }

    // Behaviors
    public void changeDateOfHike(DateOfHike dateOfHike) {
        Objects.requireNonNull(dateOfHike);
        appendChange(new DateOfHikeChanged(dateOfHike)).apply();
    }

    public void addGuide(GuideId guideId, Name name, Age age, License license) {
        Objects.requireNonNull(guideId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(age);
        Objects.requireNonNull(license);
        appendChange(new GuideAdded(guideId, name, age, license)).apply();
    }

    public void addRoute(RouteId routeId, Description description, Duration estimatedDuration){
        Objects.requireNonNull(routeId);
        Objects.requireNonNull(description);
        Objects.requireNonNull(estimatedDuration);
        appendChange(new RouteAdded(routeId,description,estimatedDuration)).apply();
    }

    public void changeGuideName(Name name){
        Objects.requireNonNull(name);
        appendChange(new GuideNameChanged(name)).apply();
    }

    public void changeGuideAge(Age age){
        Objects.requireNonNull(age);
        appendChange(new GuideAgeChanged(age)).apply();
    }

    public void changeGuideLicense(License license) {
        Objects.requireNonNull(license);
        appendChange(new GuideLicenseChanged(license)).apply();
    }

    public void changeRouteDescription(Description description){
        Objects.requireNonNull(description);
        appendChange(new RouteDescriptionChanged(description)).apply();
    }

    public void changeEstimatedDurationOfRoute(Duration duration){
        Objects.requireNonNull(duration);
        appendChange(new EstimatedDurationChangedInRoute(duration)).apply();
    }

    public DateOfHike dateOfHike() {
        return dateOfHike;
    }

    public Guide guide() {
        return guide;
    }

    public Route route() {
        return route;
    }

    public ReservationId reservationId() {
        return reservationId;
    }
}
