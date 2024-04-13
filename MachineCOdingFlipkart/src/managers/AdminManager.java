package managers;

import model.Admin;
import model.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AdminManager {
    private static AdminManager instance;
    private Map<String, Admin> admins;

    private AdminManager() {
        this.admins = new HashMap<>();
    }

    public static AdminManager getInstance() {
        if (instance == null) {
            instance = new AdminManager();
        }
        return instance;
    }

    public Map<String, Admin> getAdmins() {
        return admins;
    }

    public void registerAdmin(String name, String phone, int pincode) {
        Admin admin = new Admin(name, phone, pincode);
        admins.put(name, admin);
    }

    public void registerUser(String name, String phoneNumber, int pincode) {
        UserManager.getInstance().registerUser(name, phoneNumber, pincode);
    }

    public void recordPandemicResult(String adminName, String userPhone, String isPositive) {
        if(!validateIfUserExists(userPhone)){
            System.out.println("User does not exist");
            return;
        }
        if(isPositive.equalsIgnoreCase("Y")) {
            System.out.println("Record of UserId " + userPhone + " saved successfully as Positive");
            ZoneManager.getInstance().updateZoneStatus(userPhone, true);
            UserManager.getInstance().updateUser(userPhone, true);
        }
        else {
            System.out.println("Record of UserId " + userPhone + " saved successfully as Negative");
            ZoneManager.getInstance().updateZoneStatus(userPhone, false);
            UserManager.getInstance().updateUser(userPhone, false);
        }
    }

    public void recordPandemicResult(String adminName, String userPhone, String isPositive, Date date) {
        if(isPositive.equalsIgnoreCase("Y")) {
            System.out.println("Record of UserId " + userPhone + " saved successfully as Positive");
            ZoneManager.getInstance().updateZoneStatus(userPhone, true);
            UserManager.getInstance().updateUser(userPhone, true);
        }
        else {
            System.out.println("Record of UserId " + userPhone + " saved successfully as Negative");
            ZoneManager.getInstance().updateZoneStatus(userPhone, false);
            UserManager.getInstance().updateUser(userPhone, false);
        }
    }


    private boolean validateIfUserExists(String phone){
        return UserManager.getInstance().getUsers().containsKey(phone);
    }
}
