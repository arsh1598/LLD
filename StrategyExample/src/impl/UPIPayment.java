package impl;

import interfaces.PaymentStrategy;

public class UPIPayment implements PaymentStrategy {

    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
        System.out.println("upi payment successful!");
        return true;
    }

    @Override
    public String getPaymentDetails() {
        return "UPI ID - " + upiId;
    }
}
