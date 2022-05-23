package com.sofkaU.campusDDD.domain.hike.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.campusDDD.domain.shared.values.HikeId;
import com.sofkaU.campusDDD.domain.shared.values.ReservationId;

public class AssociateReservation extends Command {

    private final HikeId hikeId;
    private final ReservationId reservationId;

    public AssociateReservation(HikeId hikeId, ReservationId reservationId) {
        this.hikeId = hikeId;
        this.reservationId = reservationId;
    }

    public HikeId getHikeId() {
        return hikeId;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }
}
