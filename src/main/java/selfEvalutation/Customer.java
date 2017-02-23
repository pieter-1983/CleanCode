package selfEvalutation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by pieterst on 23/02/2017.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private LoyaltyCard loyaltyCard;
    private HashMap<LocalDate, List<ShopItem>> groceries = new HashMap<>();

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

    public void buySomeGroceries(List<ShopItem> thingsCusBought){
        LocalDate date = LocalDate.now();
        groceries.put(date, thingsCusBought);
    }

    public List<ShopItem> getGroceriesByDay(LocalDate date) {
        return groceries.get(date);
    }
}
