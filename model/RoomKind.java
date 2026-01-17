package model;

public enum RoomKind {
    SINGLE,
    DOUBLE,
    SUITE;

    public String getLabel() {
        return this.name().toLowerCase();
    }
}