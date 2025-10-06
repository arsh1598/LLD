public class IdleState implements ATMState{
    private ATMMachine atmMachine;

    public IdleState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted. Please enter your PIN.");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("No card inserted. Please insert your card first.");
    }

    @Override
    public void withdraw(int amount) {
        System.out.println("No card inserted. Please insert your card first.");
    }
}
