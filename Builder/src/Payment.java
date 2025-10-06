public class Payment {
    private String cardNumber;
    private String cardHolder;
    private String expirationDate;
    private String cvv;
    public String getCardNumber() {
        return cardNumber;
    }
    public String getCardHolder() {
        return cardHolder;
    }
    public String getExpirationDate() {
        return expirationDate;
    }
    public String getCvv() {
        return cvv;
    }
    private Payment(Builder builder) {
        this.cardNumber = builder.cardNumber;
        this.cardHolder = builder.cardHolder;
        this.expirationDate = builder.expirationDate;
        this.cvv = builder.cvv;
    }
    public static class Builder{
        private String cardNumber;
        private String cardHolder;
        private String expirationDate;
        private String cvv;

        public Builder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public Builder setCardHolder(String cardHolder) {
            this.cardHolder = cardHolder;
            return this;
        }
        public Builder setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder setCVV(String cvv) {
            this.cvv = cvv;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}
