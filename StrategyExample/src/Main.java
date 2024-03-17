import impl.DiwaliDiscount;
import impl.HoliDiscount;
import interfaces.Discount;

public class Main {
    public static void main(String[] args) {
        Discount discount;
        String s = "Diwali szn";
        if(s.contains("Diwali")) discount = new DiwaliDiscount();
        else discount = new HoliDiscount();
        System.out.println(discount.discount(100));
    }
}