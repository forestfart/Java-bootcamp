package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Aspect
@Component
public class ProcessOrderStalker {

    private final Logger LOGGER = LoggerFactory.getLogger(ProcessOrderStalker.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && target(object) && args(order, userId)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + " will process order for the following Items Id's: " + order.getItems().stream().map(n -> n.getProductId().toString()).collect(Collectors.joining(" ,")) + " to user Id: " + userId.toString());
    }
}
