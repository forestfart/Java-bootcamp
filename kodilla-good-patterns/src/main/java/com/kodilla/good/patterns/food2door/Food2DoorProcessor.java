package food2door;

public class Food2DoorProcessor {

    private OrderService orderService;

    public Food2DoorProcessor(OrderService orderService) {
        this.orderService = orderService;
    }

    public void process(final ShoppingCart userCart) {

        orderService.process(userCart.getUser(), userCart);
    }
}
