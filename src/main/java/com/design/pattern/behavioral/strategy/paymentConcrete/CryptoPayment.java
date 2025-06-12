package com.design.pattern.behavioral.strategy.paymentConcrete;

import com.design.pattern.behavioral.strategy.PaymentStrategy;

public class CryptoPayment implements PaymentStrategy {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Crypto Wallet: " + walletAddress);
    }
}
