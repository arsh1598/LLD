public class ATMMachine {
    private ATMState atmState;
    private int balance;
    //private Card card;
    public ATMMachine(){
        atmState = new IdleState(this);
        balance = 1000;
    }
    public void setCurrentState(ATMState atmState){
        this.atmState = atmState;
    }
    public void insertCard(){
        atmState.insertCard();
    }
    public void ejectCard(){
        atmState.ejectCard();
    }
    public void enterPin(int pin){
        atmState.enterPin(pin);
    }
    public void withdraw(int amount){
        atmState.withdraw(amount);
    }
}
