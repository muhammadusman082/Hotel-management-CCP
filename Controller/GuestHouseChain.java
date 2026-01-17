package controller;

import model.Guest;
import entities.Reservation;
import entities.Room;
import model.ReserverPayer;

public class GuestHouseChain {

    private GuestHouse managementUnit; 

    public GuestHouseChain(GuestHouse managementUnit) {
        this.managementUnit = managementUnit;
    }

    public boolean makeReservation(Reservation res, Room targetRoom) {
        if (!isReservationPossible(targetRoom)) {
            return false;
        }
        return managementUnit.createReservation(res, targetRoom);
    }

    public boolean cancelReservation(int resId) {
        if (!isCancellationValid(resId)) {
            return false;
        }
        return managementUnit.cancelReservation(resId);
    }

    public boolean checkInGuest(Guest visitor, int roomNo) {
        if (!isCheckInAllowed(roomNo)) {
            return false;
        }
        return managementUnit.checkInGuest(visitor, roomNo);
    }

    public boolean checkOutGuest(int roomNo) {
        if (!isCheckOutAllowed(roomNo)) {
            return false;
        }
        return managementUnit.checkOutGuest(roomNo);
    }

    public boolean isReservationPossible(Room rm) {
        return rm != null && rm.getOccupied() == null;
    }

    public boolean isCancellationValid(int id) {
        return id > 0;
    }

    public ReserverPayer createReserverPayer(ReserverPayer payer) {
        if (payer != null) {
            payer.create();
            return payer;
        }
        return null;
    }

    public boolean isCheckInAllowed(int roomNo) {
        return managementUnit.available(roomNo);
    }

    public boolean isCheckOutAllowed(int roomNo) {
        return !managementUnit.available(roomNo);
    }
}