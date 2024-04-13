import managers.AdminManager;
import managers.UserManager;
import managers.ZoneManager;
import model.Symptom;
import strategies.DefaultRiskCalculationStrategy;
import strategies.RiskCalculationStrategy;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        AdminManager adminManager = AdminManager.getInstance();
        ZoneManager zoneManager = ZoneManager.getInstance();

        userManager.registerUser("user1", "1234", 122017);
        userManager.registerUser("user2", "12345", 122017);
        userManager.registerUser("user3", "123456", 400083);
        userManager.registerUser("user3", "123456", 400083);
        userManager.registerUser("user3", "123456", 400083);
        Set<Symptom> symptoms2 = new HashSet<>();
        symptoms2.add(Symptom.COUGH);
        Set<Symptom> symptoms3 = new HashSet<>();
        symptoms3.add(Symptom.COUGH);
        symptoms3.add(Symptom.FEVER);
        RiskCalculationStrategy defaultRiskCalculationStrategy = new DefaultRiskCalculationStrategy();
        userManager.performSelfAssessment("1234", new HashSet<>(), "NO", "No", defaultRiskCalculationStrategy);
        userManager.performSelfAssessment("12345", symptoms2, "Yes", "Yes", defaultRiskCalculationStrategy);
        userManager.performSelfAssessment("123456", symptoms3, "NO", "No", defaultRiskCalculationStrategy);
        userManager.performSelfAssessment("16363526352", new HashSet<>(), "NO", "No", defaultRiskCalculationStrategy);

        adminManager.registerAdmin("admin", "100", 400083);
        adminManager.registerUser("admin1", "123", 122017);
        adminManager.registerUser("admin2", "124", 122017);
        adminManager.registerUser("admin3", "125", 122017);

        adminManager.recordPandemicResult("admin", "12345", "Y");
        adminManager.recordPandemicResult("admin", "1234", "Y");
        adminManager.recordPandemicResult("admin", "125", "Y");
        adminManager.recordPandemicResult("admin", "123", "Y");
        adminManager.recordPandemicResult("admin", "124", "Y");
//        System.out.println(userManager.getUsers());
//        System.out.println(zoneManager.getZones());
//
        zoneManager.getZone(122017);


    }
}