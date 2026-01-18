package test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import controller.GuestHouse;
import controller.GuestHouseChain;
import entities.Room;
import entities.Reservation;
import model.*;
import java.util.Date;

public class GuestHouseChainTest {

    @Test
    public void testMakeReservation() {
        
        System.out.println("===== Guest House Management System =====\n");
      
        Name houseName = new Name("Vantage", "Lodge");
        GuestHouse guestHouse = new GuestHouse(houseName.toString());

        GuestHouseChain chain = new GuestHouseChain(guestHouse);

        Room room = new Room(101);
        guestHouse.addRoom(room);

        Reservation res = new Reservation(new Date(), new Date(), new Date(), 7001);

        boolean result = chain.makeReservation(res, room);
        assertTrue(result);
    }

    @Test
    public void testCheckInGuest() {
        Name houseName = new Name("Vantage", "Lodge");
        GuestHouse guestHouse = new GuestHouse(houseName.toString());

        GuestHouseChain chain = new GuestHouseChain(guestHouse);

        Room room = new Room(101);
        guestHouse.addRoom(room);

        Guest guest = new Guest(
                new Name("muhammad", "Usman"),
                new Address("Street 5", "Karachi", "75500"));

        boolean result = chain.checkInGuest(guest, 101);
        assertTrue(result);
    }

    @Test
    public void testCancelReservation() {
        Name houseName = new Name("Vantage", "Lodge");
        GuestHouse guestHouse = new GuestHouse(houseName.toString());

        GuestHouseChain chain = new GuestHouseChain(guestHouse);

        Room room = new Room(101);
        guestHouse.addRoom(room);

        Reservation res = new Reservation(new Date(), new Date(), new Date(), 7001);
        chain.makeReservation(res, room);

        boolean result = chain.cancelReservation(7001);
        assertTrue(result);
    }
}