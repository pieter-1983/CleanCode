package selfEvalutation;

import org.apache.xmlbeans.impl.common.ConcurrentReaderHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by davids on 23/02/2017.
 */
public class ShoppingCart {

    private Map<ShopItem, Integer> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }

    public Map<ShopItem, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void addItemToCart(ShopItem item, int quantity) {
        if (shoppingCart.containsKey(item)) {
            int temp = shoppingCart.get(item);
            shoppingCart.put(item, temp + quantity);
        } else {
            shoppingCart.put(item, quantity);
        }
    }
}
