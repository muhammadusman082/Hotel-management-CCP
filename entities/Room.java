package entities;

import model.Guest;

public class Room {
    private int roomID;
    private Guest currentGuest;

    public Room(int roomID) {
        this.roomID = roomID;
    }

    public void createGuest() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guest registration logic for room ").append(this.roomID).append(" is pending.");
        System.out.println(sb.toString());
    }

    public int getNumber() {
        return roomID;
    }

    public void setNumber(int roomID) {
        this.roomID = roomID;
    }

    public Guest getOccupied() {
        return this.currentGuest;
    }

    public void setOccupied(Guest currentGuest) {
        this.currentGuest = currentGuest;
    }
}