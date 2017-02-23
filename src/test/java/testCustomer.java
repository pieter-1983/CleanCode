import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import selfEvalutation.Customer;
import selfEvalutation.LoyaltyCard;
import selfEvalutation.ShopItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class testCustomer {

    Customer testCus1 = new Customer("Elise", "Lodewyckx", new LoyaltyCard("123", 6) );

    List<ShopItem> testGroceriesCus1 = new ArrayList<>();

    ShopItem testItem1 = new ShopItem("Chocolat");
    ShopItem testItem2 = new ShopItem("candy");
    ShopItem testItem3 = new ShopItem("fruit");

    @Before
    public void setUp(){
        testGroceriesCus1.add(testItem1);
        testGroceriesCus1.add(testItem2);
        testGroceriesCus1.add(testItem3);
    }


    @Test
    public void testIfGroceriesAreProperlyStored(){
        testCus1.buySomeGroceries(testGroceriesCus1);
        Assertions.assertThat(testCus1.getGroceriesByDay(LocalDate.now())).isEqualTo(testGroceriesCus1);
    }

    
}
