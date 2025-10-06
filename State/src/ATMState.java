public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void withdraw(int amount);
}
