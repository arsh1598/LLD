package Repo;

import users.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
    private Map<String, User> userMap;

    private static volatile UserRepo instance = null;

    private UserRepo(){
        userMap = new HashMap<>();
    }

    public static UserRepo getInstance() {
        if(instance==null) {
            synchronized (UserRepo.class) {
                if (instance == null)
                    instance = new UserRepo();
            }
        }
        return instance;
    }

    public Map<String, User> getUserMap() {
        return this.userMap;
    }
}
