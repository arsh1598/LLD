public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment.Builder()
                .setCardNumber("1234 5678 9012 3456")
                .setCardHolder("John Doe")
                .setExpirationDate("12/25")
                .setCVV("123")
                .build();
        System.out.println("Cardholder: " + payment.getCardHolder());
    }
}