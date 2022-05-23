package com.sofkaU.campusDDD.domain.reservation;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.campusDDD.domain.reservation.events.*;
import com.sofkaU.campusDDD.domain.reservation.values.Email;
import com.sofkaU.campusDDD.domain.reservation.values.MainClientId;
import com.sofkaU.campusDDD.domain.reservation.values.ReservationDate;
import com.sofkaU.campusDDD.domain.reservation.values.TouristId;
import com.sofkaU.campusDDD.domain.shared.values.Age;
import com.sofkaU.campusDDD.domain.shared.values.Name;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Reservation extends AggregateEvent<ReservationId> {

    protected ReservationDate reservationDate;
    protected List<Tourist> tourists;
    protected MainClient mainClient;

    public Reservation(ReservationId entityId, ReservationDate reservationDate) {
        super(entityId);
        this.reservationDate = reservationDate;
        appendChange(new ReservationCreated(reservationDate)).apply();
    }

    private Reservation(ReservationId reservationId) {
        super(reservationId);
        subscribe(new ReservationChange(this));
    }

    public static Reservation from(ReservationId reservationId, List<DomainEvent> events) {
        Reservation reservation = new Reservation(reservationId);
        events.forEach(reservation::applyEvent);
        return reservation;
    }

    // Behaviors
    public void addTourist(TouristId touristId, Name name, Age age) {
        Objects.requireNonNull(touristId);
        Objects.requireNonNull(age);
        Objects.requireNonNull(name);
        appendChange(new TouristAdded(touristId, name, age)).apply();
    }

    public void addMainClient(MainClientId mainClientId, Name name, Age age, Email email) {
        Objects.requireNonNull(mainClientId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(age);
        Objects.requireNonNull(email);
        appendChange(new MainClientAdded(mainClientId, name, age, email)).apply();
    }

    public void changeReservationDate(ReservationDate reservationDate){
        Objects.requireNonNull(reservationDate);
        appendChange(new ReservationDateChanged(reservationDate)).apply();
    }

    public void changeTouristName(TouristId touristId, Name name){
        Objects.requireNonNull(touristId);
        Objects.requireNonNull(name);
        appendChange(new TouristNameChanged(touristId, name)).apply();
    }

    public void changeTouristAge(TouristId touristId, Age age){
        Objects.requireNonNull(touristId);
        Objects.requireNonNull(age);
        appendChange(new TouristAgeChanged(touristId, age)).apply();
    }

    public void changeMainClientName(Name name){
        Objects.requireNonNull(name);
        appendChange(new MainClientNameChanged(name)).apply();
    }

    public void changeMainClientAge(Age age){
        Objects.requireNonNull(age);
        appendChange(new MainClientAgeChanged(age)).apply();
    }

    public void changeMainClientEmail(Email email){
        Objects.requireNonNull(email);
        appendChange(new MainClientEmailChanged(email)).apply();
    }

    // helpers
    public Optional<Tourist> getTouristById(TouristId touristId) {
        return tourists.stream().filter(tourist -> tourist.identity().equals(touristId)).findFirst();
    }

    public ReservationDate reservationDate() {
        return reservationDate;
    }

    public List<Tourist> tourists() {
        return tourists;
    }

    public MainClient mainClient() {
        return mainClient;
    }
}
















