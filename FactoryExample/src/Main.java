import impl.RouteSelectorFactory;
import interfaces.RouteSelector;

public class Main {
    public static void main(String[] args) {
        RouteSelectorFactory factory = new RouteSelectorFactory();
        RouteSelector routeSelector = factory.getInstance("D");
        routeSelector.getRoute();
    }
}