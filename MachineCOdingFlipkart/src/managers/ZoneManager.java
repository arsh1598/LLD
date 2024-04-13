package managers;

import model.User;
import model.Zone;

import java.util.HashMap;
import java.util.Map;

public class ZoneManager {
    private static ZoneManager instance;
    private Map<Integer, Zone> zones;

    private ZoneManager() {
        this.zones = new HashMap<>();
    }

    public static ZoneManager getInstance() {
        if (instance == null) {
            instance = new ZoneManager();
        }
        return instance;
    }

    public Map<Integer, Zone> getZones() {
        return this.zones;
    }

    public void updateZoneStatus(String userPhone, boolean isPositive) {
        User user = UserManager.getInstance().getUsers().get(userPhone);
        updateZoneStatus(user.getPincode(), isPositive, user.isPositive());
    }

    private void updateZoneStatus(int pincode, boolean isPositive, boolean pastResult) {
        Zone zone = this.zones.getOrDefault(pincode, new Zone(pincode));
        if (isPositive) {
            if(!pastResult)
                zone.setNumPositiveCases(zone.getNumPositiveCases()+1);
        }else{
            if(pastResult)
                zone.setNumPositiveCases(zone.getNumPositiveCases()-1);
        }
        this.zones.put(pincode, zone);
    }

    public void getZone(int pincode) {
        if(this.zones.containsKey(pincode)){
            System.out.println("No. of positive cases: " + this.zones.get(pincode).getNumPositiveCases());
            System.out.println(this.zones.get(pincode).getZoneColor());
        }
        else{
            System.out.println("Zone details does not exist in database");
        }
    }
}
