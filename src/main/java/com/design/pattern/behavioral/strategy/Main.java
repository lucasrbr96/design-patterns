package com.design.pattern.behavioral.strategy;


import com.design.pattern.behavioral.strategy.paymentConcrete.CreditCardPayment;
import com.design.pattern.behavioral.strategy.paymentConcrete.CryptoPayment;
import com.design.pattern.behavioral.strategy.paymentConcrete.PayPalPayment;
import com.design.pattern.behavioral.strategy.paymentConcrete.PaymentContext;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(150.00);

        context.setStrategy(new PayPalPayment("user@example.com"));
        context.executePayment(75.50);

        context.setStrategy(new CryptoPayment("0xABC123XYZ456"));
        context.executePayment(0.003);
    }
}