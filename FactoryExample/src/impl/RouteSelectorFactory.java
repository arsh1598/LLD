package impl;

public class RouteSelectorFactory {

    public interfaces.RouteSelector getInstance(String s){
        if(s.equals("D")) return new DigitalAssetRouteSelector();
        else return new WalletRouteSelector();
    }
}
