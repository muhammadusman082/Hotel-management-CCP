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

        Address guestLoc = new Address("Street 5", "Karachi", "75500");
        Name guestName = new Name("Usman", "Ali"); 
        Guest primaryGuest = new Guest(guestName, guestLoc);

        System.out.println("Profile generated: " + guestName.toString());

        Money roomPrice = new Money(15000); 
        RoomType roomType = new RoomType(RoomKind.DOUBLE, roomPrice); 

        System.out.println("Category: " + roomType.getKind());
        System.out.println("Nightly Rate: " + roomType.getCost().getAmount());

        Date today = new Date();
        Reservation resInfo = new Reservation(today, today, today, 7001); 

        boolean isReserved = chainManager.makeReservation(resInfo, r101);
        System.out.println("Booking Confirmation (ID 7001): " + isReserved);

        chainManager.checkInGuest(primaryGuest, 101);
        System.out.println("Update: Guest entry recorded for Room 101");

        boolean isFree = myGuestHouse.available(101);
        System.out.println("Current Availability (Room 101): " + isFree);

        chainManager.checkOutGuest(101);
        System.out.println("Update: Guest departure recorded for Room 101");

        boolean isRemoved = chainManager.cancelReservation(7001);
        System.out.println("Final Status: Reservation 7001 removed -> " + isRemoved);
    }
}
