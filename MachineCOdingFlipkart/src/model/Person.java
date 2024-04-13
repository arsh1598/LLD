package model;

abstract class Person {
    private String name;
    private String phone;
    private int pincode;

    public Person(String name, String phone, int pincode) {
        this.name = name;
        this.phone = phone;
        this.pincode = pincode;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getPincode() {
        return pincode;
    }

}
