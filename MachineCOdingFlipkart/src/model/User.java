package model;

import java.util.HashSet;
import java.util.Set;
import strategies.RiskCalculationStrategy;

public class User extends Person{
    private Set<Symptom> symptoms;
    private boolean travelHistory;
    private boolean contactWithPositivePatient;
    private int riskPercentage;
    private boolean positive;

    public boolean isPositive() {
        return positive;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }
    public Set<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(Set<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    public boolean isTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public boolean isContactWithPositivePatient() {
        return contactWithPositivePatient;
    }

    public void setContactWithPositivePatient(boolean contactWithPositivePatient) {
        this.contactWithPositivePatient = contactWithPositivePatient;
    }

    public int getRiskPercentage() {
        return riskPercentage;
    }

    public void calculateRisk(RiskCalculationStrategy riskCalculationStrategy) {
        this.riskPercentage = riskCalculationStrategy.calculateRisk(this);
    }

    public User(String name, String phone, int pincode) {
        super(name, phone, pincode);
        this.symptoms = new HashSet<>();
        this.travelHistory = false;
        this.contactWithPositivePatient = false;
        this.riskPercentage = 0;
        this.positive = false;
    }
    public User(String name, String phone, int pincode, Set<Symptom> symptoms, boolean travelHistory, boolean contactWithPositivePatient, int riskPercentage) {
        super(name, phone, pincode);
        this.symptoms = symptoms;
        this.travelHistory = travelHistory;
        this.contactWithPositivePatient = contactWithPositivePatient;
        this.riskPercentage = 0;
        this.positive=false;
    }

    @Override
    public String toString() {
        return "User{" +
                "symptoms=" + symptoms +
                ", travelHistory=" + travelHistory +
                ", contactWithPositivePatient=" + contactWithPositivePatient +
                ", riskPercentage=" + riskPercentage +
                ", positive=" + positive +
                '}';
    }
}
