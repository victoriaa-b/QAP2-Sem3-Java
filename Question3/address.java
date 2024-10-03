package Question3;

public class address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // constructor
    public address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;

    }
        // making the full address the string
        public String toString() {

            return street + ", " + city + ", " + state + " " + zip;
    }

    }

