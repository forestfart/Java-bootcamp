package food2door;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrderRequestRetriever {

    public ShoppingCart retrieve(ArrayList<Product> productList) {

        User user = new User("westfall",
                "John",
                "Clemson",
                LocalDate.of(1985,5,3), // DOB
                new LocalAddress("37 West st",
                "Ghost Town",
                "31-558",
                "GhostCountry"),
                621500400);

        ShoppingCart userCart = new ShoppingCart(user);

        userCart.addToCart(productList.get(0), new BigDecimal("50"));
        userCart.addToCart(productList.get(1), new BigDecimal("1.20"));
        userCart.addToCart(productList.get(2), new BigDecimal("0.20"));
        userCart.addToCart(productList.get(6), new BigDecimal("3.00"));

        return userCart;
    }
}
