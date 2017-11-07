import food2door.Food2DoorProcessor;
import food2door.OrderRequestRetriever;
import food2door.OrderService;
import food2door.ShoppingCart;
import org.junit.Test;

public class Food2DoorTestSuite {
    @Test
    public void test(){
        //prepare suppliers list



        //prepare order
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ShoppingCart userCart = orderRequestRetriever.retrieve();

        System.out.println(userCart.getShoppingCart().size());

        Food2DoorProcessor food2DoorProcessor = new Food2DoorProcessor(new OrderService());
        food2DoorProcessor.process(userCart);
    }
}

