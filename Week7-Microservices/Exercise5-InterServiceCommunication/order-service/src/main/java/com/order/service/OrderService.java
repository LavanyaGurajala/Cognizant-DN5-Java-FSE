package com.order.service;

import com.order.model.Order;
import com.order.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class OrderService {

    private final WebClient.Builder webClientBuilder;

    public OrderService(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }

    public String getOrderDetails(Long orderId) {
        Order order = new Order(orderId, 101L, "Laptop");
        User user = webClientBuilder.build()
                .get()
                .uri("http://user-service/users/{id}", order.getUserId())
                .retrieve()
                .bodyToMono(User.class)
                .block();

        return "Order " + order.getId() + " for " + order.getItem() + " belongs to " + user.getName();
    }
}
