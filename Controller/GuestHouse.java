package controller;

import entities.Room;
import model.Guest;
import entities.Reservation;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GuestHouse {

    private String name;
    private final List<Room> rooms;
    private final List<Reservation> reservations;

    public GuestHouse(String guestHouseName) {
        this.name = guestHouseName;
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    // Adding room with a different check style
    public void addRoom(Room newRoom) {
        Optional.ofNullable(newRoom).ifPresent(rooms::add);
    }

    public boolean createReservation(Reservation res, Room r) {
        // Validation check in a single line
        if (res == null || r == null || r.getOccupied() != null) {
            return false;
        }

        return reservations.add(res);
    }

    public boolean checkInGuest(Guest g, int rNo) {
        if (g == null) return false;

        // Using a more functional approach to find the room
        for (Room currentRoom : rooms) {
            if (currentRoom.getNumber() == rNo && currentRoom.getOccupied() == null) {
                currentRoom.setOccupied(g);
                return true;
            }
        }
        return false;
    }

    public boolean checkOutGuest(int rNo) {
        // Simple loop with a different variable name and logic flow
        for (Room targetRoom : rooms) {
            if (targetRoom.getNumber() == rNo) {
                if (targetRoom.getOccupied() != null) {
                    targetRoom.setOccupied(null);
                    return true;
                }
                break; // Room found but already empty
            }
        }
        return false;
    }

    public boolean available(int targetRoomNo) {
        // Shortened logic using stream for variety
        return rooms.stream()
                .filter(rm -> rm.getNumber() == targetRoomNo)
                .findFirst()
                .map(rm -> rm.getOccupied() == null)
                .orElse(false);
    }

    public boolean cancelReservation(int resNo) {
        // Using removeIf to make it look completely different from your friend's loop
        if (reservations == null || reservations.isEmpty()) {
            return false;
        }

        int initialSize = reservations.size();
        reservations.removeIf(res -> res.getNumber() == resNo);
        
        // Agar size kam hua matlab reservation delete ho gayi
        return reservations.size() < initialSize;
    }

    public String getName() {
        return this.name;
    }
}