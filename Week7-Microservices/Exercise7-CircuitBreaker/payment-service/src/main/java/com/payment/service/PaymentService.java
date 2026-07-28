package com.payment.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(String orderId) {
        try {
            return invokePaymentProvider(orderId);
        } catch (RuntimeException exception) {
            return paymentFallback(orderId, exception);
        }
    }

    private String invokePaymentProvider(String orderId) {
        if ("fail".equalsIgnoreCase(orderId)) {
            throw new IllegalStateException("Downstream payment provider is unavailable");
        }
        return "Payment processed successfully for order " + orderId;
    }

    public String paymentFallback(String orderId, Throwable throwable) {
        return "Payment service is temporarily unavailable for order " + orderId + ". Please try again later.";
    }
}
