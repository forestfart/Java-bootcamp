package food2door;//package  com.kodilla.good.patterns;

//import com.kodilla.good.patterns.challenges.*;

public class PatternsMain {
    public static void main(String[] args) {

        // Zadanie z modułu 9.1
        /*MovieStore movieStore = new MovieStore();
        Map<String, List<String>> newList = movieStore.getMovies();

        String movieTitles = newList.entrySet().stream()
                .map(n -> n.getValue())
                .flatMap(n -> n.stream())
                .collect(Collectors.joining("!","Movie titles from the store: ",""));

        System.out.println(movieTitles);*/

        // Zadanie z modułu 9.2
        /*OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailNotification(), new OrderKapcie(), new KapcieOrderRepository());
        productOrderProcessor.process(orderRequest);*/

        // Zadanie z modułu 9.4 "Food2Door"

        ProductListRetriever productListRetriever = new ProductListRetriever();
        ProductList productList = productListRetriever.retrieve();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ShoppingCart userCart = orderRequestRetriever.retrieve(productList.getProductList());

        Food2DoorProcessor extraFoodShopOrders = new Food2DoorProcessor(new ExtraFoodShop());
        extraFoodShopOrders.process(userCart);

        Food2DoorProcessor healthyShopOrders = new Food2DoorProcessor(new HealthyShop());
        healthyShopOrders.process(userCart);

        Food2DoorProcessor glutenFreeShopOrders = new Food2DoorProcessor(new GlutenFreeShop());
        glutenFreeShopOrders.process(userCart);
    }
}
