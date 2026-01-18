package test;

import org.junit.Test;
import static org.junit.Assert.*;
import controller.GuestHouse;
import entities.Room;
import entities.Reservation;
import model.*;
import java.util.Date;

public class GuestHouseTest {

    @Test
    public void testCreateReservation_Success() {
        // Name object ko .toString() karke bhej raha hoon taake error khatam ho jaye
        Name houseName = new Name("Vantage", "Lodge");
        GuestHouse house = new GuestHouse(houseName.toString());
        
        Room room = new Room(101);
        house.addRoom(room);

        Reservation res = new Reservation(new Date(), new Date(), new Date(), 7001);

        boolean result = house.createReservation(res, room);
        assertTrue(result);
    }

    @Test
    public void testCreateReservation_Null() {
        Name houseName = new Name("Vantage", "Lodge");
        GuestHouse house = new GuestHouse(houseName.toString());
        Room room = new Room(101);

        boolean result = house.createReservation(null, room);
        assertFalse(result);
    }

    @Test
    public void testCheckInGuest() {
        Name houseName = new Name("Vantage", "Lodge");
        GuestHouse house = new GuestHouse(houseName.toString());
        Room room = new Room(101);
        house.addRoom(room);

        Guest guest = new Guest(
                new Name("Usman", "Ali"),
                new Address("Street 5", "Karachi", "75500"));

        boolean result = house.checkInGuest(guest, 101);
        assertTrue(result);
    }

    @Test
    public void testAvailable() {
        Name houseName = new Name("Vantage", "Lodge");
        GuestHouse house = new GuestHouse(houseName.toString());
        Room room = new Room(101);
        house.addRoom(room);

        boolean result = house.available(101);
        assertTrue(result);
    }
}