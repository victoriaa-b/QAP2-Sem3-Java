package Question3;

public class creditCard {
    private money balance;
    private money creditLimit;
    private person owner;


    // constructor
    public creditCard(person newCardHolder, money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new money(limit);
        this.balance = new money(0);

}
    // getters
    public money getBalance(){
        return new money(balance);
    }

    public money getCreditLimit(){
        return new money(creditLimit);
    }

    public String getPersonalInfo(){

        return owner.toString();
    }

    // how to charge the credit card
    public void charge(money amount){
        if (balance.add(amount).compareTo(creditLimit) <=0){
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("The charge exceeds the credit limit");
        }
    }

    // how to make a payment 
    public void payment(money amount){
        balance = balance.subtract(amount);
        System.out.println("Payment" + amount);
    }
}
