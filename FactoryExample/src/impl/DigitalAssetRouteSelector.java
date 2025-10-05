package impl;

import interfaces.RouteSelector;

public class DigitalAssetRouteSelector implements RouteSelector {
    @Override
    public void getRoute() {
        System.out.println("In DigitalAssetRouteSelector");
    }
}
