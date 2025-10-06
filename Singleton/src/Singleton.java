import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private static volatile Singleton instance;
    private Map<Integer, Integer> map;

    private Singleton() {
        map = new HashMap<>();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public Map<Integer, Integer> getMap() {
        return map;
    }
}
