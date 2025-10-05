import impl.CardPayment;
import impl.ShoppingCart;
import impl.UPIPayment;
import interfaces.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("abc", 600);
        cart.addItem("def", 400);

        System.out.println("\n" + "=".repeat(50));
        System.out.println("TESTING DIFFERENT PAYMENT STRATEGIES");
        System.out.println("=".repeat(50));

        PaymentStrategy creditCard = new CardPayment(
                "1234-5678-9012-3456", "John Doe", "123"
        );
        cart.setPaymentStrategy(creditCard);
        cart.checkout();

        System.out.println("\n" + "-".repeat(30));

        PaymentStrategy paypal = new UPIPayment(
                "john.doe@email.com"
        );
        cart.setPaymentStrategy(paypal);
        cart.checkout();

        System.out.println("\n" + "-".repeat(30));

    }
}