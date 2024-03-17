package impl;

import interfaces.Discount;

public class HoliDiscount implements Discount {

    @Override
    public int discount(int val) {
        return val/2;
    }
}
