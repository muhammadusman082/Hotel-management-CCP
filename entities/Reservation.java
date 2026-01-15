package entities;

import java.util.Date;

public class Reservation {
    private Date bookingDate;
    private Date checkIn;
    private Date checkOut;
    private int idCode;

    public Reservation(Date bookingDate, Date checkIn, Date checkOut, int idCode) {
        this.bookingDate = bookingDate;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.idCode = idCode;
    }

    public Date getReservationDate() {
        return this.bookingDate;
    }

    public void setReservationDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getStartDate() {
        return this.checkIn;
    }

    public void setStartDate(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getEndDate() {
        return this.checkOut;
    }

    public void setEndDate(Date checkOut) {
        this.checkOut = checkOut;
    }

    public int getNumber() {
        return this.idCode;
    }

    public void setNumber(int idCode) {
        this.idCode = idCode;
    }

    public void create() {
        String msg = String.format("Reservation #%d has been successfully initialized.", idCode);
        System.out.println(msg);
    }
}