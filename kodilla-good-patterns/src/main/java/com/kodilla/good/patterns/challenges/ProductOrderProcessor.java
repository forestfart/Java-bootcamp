package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isOrdered = orderService.orderRequest(orderRequest.getUser(), orderRequest.getProductType(), orderRequest.getTransactionDate());

        if(isOrdered) {
            informationService.informUser(orderRequest.getUser(), orderRequest);
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProductType(), orderRequest.getTransactionDate());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}