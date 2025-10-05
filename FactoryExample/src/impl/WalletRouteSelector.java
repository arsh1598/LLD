package impl;


import interfaces.RouteSelector;

public class WalletRouteSelector implements RouteSelector {
    @Override
    public void getRoute() {
        System.out.println("In WalletRouteSelector");
    }
}
