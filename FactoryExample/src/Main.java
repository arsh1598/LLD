import impl.Android;
import impl.OSFactory;
import interfaces.OS;

public class Main {
    public static void main(String[] args) {
        OSFactory factory = new OSFactory();
        OS os = factory.getInstance("Ios");
        os.spec();
    }
}