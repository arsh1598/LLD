package impl;

import interfaces.PaymentStrategy;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Double> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void addItem(String item, double price) {
        items.put(item, price);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public double calculateTotal() {
        return items.values().stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean checkout() {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method!");
            return false;
        }

        double total = calculateTotal();
        System.out.println("\n=== CHECKOUT ===");
        System.out.println("Total amount: $" + total);
        System.out.println("Payment method: " + paymentStrategy.getPaymentDetails());
        System.out.println("================");

        return paymentStrategy.pay(total);
    }
}

