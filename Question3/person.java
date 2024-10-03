package Question3;

public class person {
    private String lastName;
    private String firstName;
    private address home;

    // constructor
    public person(String lastName, String firstName, address home){
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // display the toString of owner info 
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
