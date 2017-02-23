package selfEvalutation;

/**
 * Created by pieterst on 23/02/2017.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private LoyaltyCard loyaltyCard;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName, LoyaltyCard loyaltyCard){
        this.firstName = firstName;
        this.lastName = lastName;
        this.loyaltyCard = loyaltyCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }
}
