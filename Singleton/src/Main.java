import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Map<Integer, Integer> map = instance.getMap();
        map.put(1, 100);
        System.out.println(map);
        Singleton instance2 = Singleton.getInstance();
        Map<Integer, Integer> map2 = instance2.getMap();
        map2.put(2, 200);
        System.out.println(map);

    }
}