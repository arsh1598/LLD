package impl;

import interfaces.Discount;

public class DiwaliDiscount implements Discount {

    @Override
    public int discount(int val) {
        return val/3;
    }
}
