package impl;

import interfaces.PaymentStrategy;

public class CardPayment implements PaymentStrategy {

    private String cardNumber;
    private String holderName;
    private String cvv;

    public CardPayment(String cardNumber, String holderName, String cvv) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.cvv = cvv;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Processing credit card payment and adding 2%...");
        System.out.println("Charging $" + amount*1.02 + " to card: " +
                cardNumber.substring(0, 4) + "****");

        System.out.println("Credit card payment successful!");
        return true;
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card Payment - " + holderName;
    }
}
