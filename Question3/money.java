package Question3;

public class money {
    private long dollars;
    private long cents;

    // constructor
    public money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) ((amount - dollars) * 100);

    }
    // copy constructor
     public money(money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // add 2 money objects
    public money add(money otherAmount) {
        long newCents =  this.cents + otherAmount.cents;
        long newDollars = this.dollars + otherAmount.dollars + newCents / 100;
        newCents %= 100;

        return new money(newDollars + newCents / 100.0);
    }

    // subtract one money object from another
    public money subtract(money otherAmount) {
        long totalCentsAmt1 = this.dollars * 100 +  this.cents;
        long totalCentsAmt2 = otherAmount.dollars * 100 + otherAmount.cents;
        long diff = totalCentsAmt1 - totalCentsAmt2;

        return new money(diff/ 100);

    }

    // compare two money objects
    public int compareTo(money otherObject) {
        long totalCentsAmt1 = this.dollars * 100 + this.cents;
        long totalCentsAmt2 = otherObject.dollars * 100 + otherObject.cents;
        
        return Long.compare(totalCentsAmt1,totalCentsAmt2);
    }

    // to see if money objects are equal
    public boolean equals(money otherObject){

        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;

    }

    // display toString 
    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    }




