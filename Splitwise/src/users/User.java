package users;

import java.util.List;

public class User {
    String userId;
    String phone;
    String name;
    int balance;
    List<String> friends;

    public User(String userId, String phone, String name, int balance, List<String> friends) {
        this.userId = userId;
        this.phone = phone;
        this.name = name;
        this.balance = balance;
        this.friends = friends;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", friends=" + friends +
                '}';
    }
}
