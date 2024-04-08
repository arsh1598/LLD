public class EmailSubscriber implements Observer{
    String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " " + message);
    }
}
