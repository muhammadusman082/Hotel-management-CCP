package entities;

public class HowMany {

    private int totalCount;

    public HowMany() {
        this(0);
    }

    public HowMany(int initialValue) {
        this.totalCount = initialValue;
    }

    public int getNumber() {
        return this.totalCount;
    }
}