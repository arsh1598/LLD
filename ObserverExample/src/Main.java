public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        EmailSubscriber sub1 = new EmailSubscriber("1");
        EmailSubscriber sub2 = new EmailSubscriber("2");
        publisher.addObserver(sub1);
        publisher.addObserver(sub2);
        publisher.notify("good morning");
    }
}