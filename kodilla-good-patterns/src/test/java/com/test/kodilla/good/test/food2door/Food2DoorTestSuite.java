import food2door.*;
import org.junit.Test;

public class Food2DoorTestSuite {
    @Test
    public void test(){

        //prepare order
        ProductListRetriever productListRetriever = new ProductListRetriever();
        ProductList productList = productListRetriever.retrieve();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ShoppingCart userCart = orderRequestRetriever.retrieve(productList.getProductList());

        System.out.println(userCart.getShoppingCart().size());

        Food2DoorProcessor food2DoorProcessor = new Food2DoorProcessor(new HealthyShop());
        food2DoorProcessor.process(userCart);
    }
}

