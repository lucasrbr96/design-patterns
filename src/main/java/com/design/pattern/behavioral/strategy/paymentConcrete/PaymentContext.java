package com.design.pattern.behavioral.strategy.paymentConcrete;

import com.design.pattern.behavioral.strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        if (strategy == null) {
            System.out.println("No payment strategy selected.");
            return;
        }
        strategy.pay(amount);
    }
}
