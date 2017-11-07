package food2door;

import java.math.BigDecimal;
import java.util.HashMap;

public class ShoppingCart {

    private User user;
    private HashMap<Product, BigDecimal> shoppingCart = new HashMap<>();

    public ShoppingCart(User user) {
        this.user = user;
    }

    public void addToCart(Product productToAdd, BigDecimal quantity) {
        shoppingCart.put(productToAdd, quantity);
    }

    public User getUser() {
        return user;
    }

    public HashMap<Product, BigDecimal> getShoppingCart() {
        return shoppingCart;
    }
}
