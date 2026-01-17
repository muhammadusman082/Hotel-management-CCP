package main;

import controller.*;
import entities.Room;
import entities.RoomType;
import entities.Reservation;
import model.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("--- Guesthouse Portal ---");

        Name houseName = new Name("Vantage Lodge", "GuestHouse");
        GuestHouse myGuestHouse = new GuestHouse(houseName.toString());
        GuestHouseChain chainManager = new GuestHouseChain(myGuestHouse);

        System.out.println("System initialized for: " + houseName.toString());

        Room r101 = new Room(101);
        myGuestHouse.addRoom(r101);
        System.out.println("Status: Room 101 registered.");

        Address guestLoc = new Address("Street 1", "Lahore", "54000");
        Name guestName = new Name("Babar", "Azam");
        Guest primaryGuest = new Guest(guestName, guestLoc);

        System.out.println("Profile generated: " + guestName.toString());

        Money suitePrice = new Money(12000);
        RoomType suiteType = new RoomType(RoomKind.SUITE, suitePrice);

        System.out.println("Category: " + suiteType.getKind());
        System.out.println("Nightly Rate: " + suiteType.getCost().getAmount());

        Date today = new Date();
        Reservation resInfo = new Reservation(today, today, today, 5001);

        boolean isReserved = chainManager.makeReservation(resInfo, r101);
        System.out.println("Booking Confirmation (ID 5001): " + isReserved);

        chainManager.checkInGuest(primaryGuest, 101);
        System.out.println("Update: Guest entry recorded for Room 101");

        boolean isFree = myGuestHouse.available(101);
        System.out.println("Current Availability (Room 101): " + isFree);

        chainManager.checkOutGuest(101);
        System.out.println("Update: Guest departure recorded for Room 101");

        boolean isRemoved = chainManager.cancelReservation(5001);
        System.out.println("Final Status: Reservation 5001 removed -> " + isRemoved);
    }
}