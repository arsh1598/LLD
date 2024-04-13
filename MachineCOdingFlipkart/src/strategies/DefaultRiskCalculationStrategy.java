package strategies;

import model.User;

public class DefaultRiskCalculationStrategy implements RiskCalculationStrategy {
    @Override
    public int calculateRisk(User user) {
        if (user.getSymptoms().isEmpty() && !user.isTravelHistory() && !user.isContactWithPositivePatient()) {
            return 5;
        } else if (user.getSymptoms().size() == 1 || user.isTravelHistory() || user.isContactWithPositivePatient()) {
            return 50;
        } else if (user.getSymptoms().size() == 2 || (user.getSymptoms().size() == 1 && (user.isTravelHistory() || user.isContactWithPositivePatient()))) {
            return 75;
        } else {
            return 95;
        }
    }
}
