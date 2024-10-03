package Question3;

public class creditCardDemo {
   public static void main(String[] args) {
        money limit = new money(1000);
        money firstAmount = new money(200);
        money secondAmount = new money(10.02);
        money thirdAmount = new money(25);
        money fourthAmount = new money(990);
        // creating the owner object
        person owner = new person("Breen", "Victoria", new address("123 Harvey Hall", "Mount Pearl", "NL", "A1X7B3"));
        creditCard visa = new creditCard(owner, limit);

        // Displaying the the owners information
        System.out.println(visa.getPersonalInfo());

        // displaying the inital balance
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();

        // first attempt 
        System.out.println("Attempt to charge " + firstAmount);
        visa.charge( firstAmount);
        System.out.println("Balance: " + visa.getBalance());

        // second attempt
        System.out.println("Attempt to charge " + secondAmount);
        visa.charge(secondAmount);
        System.out.println("Balance: " + visa.getBalance());

        // display payment
        System.out.println("Attempt to pay " + thirdAmount);
        visa.payment(thirdAmount);
        System.out.println("Balance: " + visa.getBalance());

        // attempt to charge 
        System.out.println("Attempt to charge " + fourthAmount);
        visa.charge(fourthAmount);
        System.out.println("Balance: " + visa.getBalance());
    }
}
