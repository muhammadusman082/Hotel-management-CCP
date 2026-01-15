package entities;

public class HowMany {
    

    private int countValue;

   
    public HowMany() {
        this(0); 
    }


    public HowMany(int initialNumber) {
        this.countValue = initialNumber;
    }

    // Getter method
    public int getNumber() {
        return this.countValue;
    }

   
    public void setNumber(int newNumber) {
        // Validation check (optional: agar sirf positive numbers chahiye hon)
        if (newNumber >= 0) {
            this.countValue = newNumber;
        } else {
            this.countValue = 0; 
        }
    }

    @Override
    public String toString() {
        return "Count: " + countValue;
    }
}