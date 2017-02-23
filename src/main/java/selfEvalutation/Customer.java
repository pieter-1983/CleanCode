package selfEvalutation;

import jersey.repackaged.com.google.common.collect.HashMultiset;
import jersey.repackaged.com.google.common.collect.Multiset;

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

    //Story 5(KevinB: not testDriven, imported with packages from google;
    public <ShopItem> List<ShopItem> getMostFrequentElements(List<ShopItem> list) {
        Multiset<ShopItem> multiset = HashMultiset.create(list);

        List<ShopItem> mostFrequents = new ArrayList<>();
        int maxCount = 0;

        for (Multiset.Entry<ShopItem> entry : multiset.entrySet()) {
            if (entry.getCount() > maxCount) {
                maxCount = entry.getCount();
                mostFrequents.clear();
                mostFrequents.add(entry.getElement());
            } else if (entry.getCount() == maxCount) {
                mostFrequents.add(entry.getElement());
            }
        }

        return mostFrequents;
    }
}
