package strategies;

import model.User;

public interface RiskCalculationStrategy {
    int calculateRisk(User user);
}
