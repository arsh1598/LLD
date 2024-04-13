package model;

public class Zone {
    private int pincode;
    private int numPositiveCases;

    public Zone(int pincode) {
        this.pincode = pincode;
        this.numPositiveCases = 0;
    }
    public ZoneColor getZoneColor() {
        if (this.numPositiveCases == 0) {
            return ZoneColor.GREEN;
        } else if (this.numPositiveCases >= 5) {
            return ZoneColor.RED;
        } else {
            return ZoneColor.ORANGE;
        }
    }
    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public int getNumPositiveCases() {
        return numPositiveCases;
    }

    public void setNumPositiveCases(int numPositiveCases) {
        this.numPositiveCases = numPositiveCases;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "pincode=" + pincode +
                ", numPositiveCases=" + numPositiveCases +
                '}';
    }
}
