package managers;

import model.Symptom;
import model.User;
import strategies.DefaultRiskCalculationStrategy;
import strategies.RiskCalculationStrategy;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserManager {
    private static UserManager instance;

    private Map<String, User> users;

    private UserManager() {
        this.users = new HashMap<>();
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }
    public Map<String, User> getUsers() {
        return users;
    }

    public void updateUser(String userPhone, boolean isPositive) {
        this.users.get(userPhone).setPositive(isPositive);
    }

    public void registerUser(String name, String phoneNumber, int pincode) {
        User user = new User(name, phoneNumber, pincode);
        users.put(phoneNumber, user);
        System.out.println("User " + user.getName() + " registered");
    }

    public void performSelfAssessment(String phone, Set<Symptom> symptoms, String travelHistory, String contactWithPositivePatient, RiskCalculationStrategy riskCalculationStrategy) {
        User user = users.get(phone);
        if(user==null){
            System.out.println("User id not present");
            return;
        }
        user.setSymptoms(symptoms);
        user.setTravelHistory(travelHistory.equalsIgnoreCase("YES"));
        user.setContactWithPositivePatient(contactWithPositivePatient.equalsIgnoreCase("YES"));
        user.calculateRisk(riskCalculationStrategy);
        System.out.println("Risk is " + user.getRiskPercentage() + "%");
    }

}
