import Repo.UserRepo;
import impl.UserServiceImpl;
import users.User;
import users.UserService;

import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User user1 = new User("user1", "1111111111", "user 1", 0, new ArrayList<>());
        User user2 = new User("user2", "2222222222", "user 2", 0, new ArrayList<>());
        User user3 = new User("user3", "3333333333", "user 3", 0, new ArrayList<>());
        User user4 = new User("user4", "4444444444", "user 4", 0, new ArrayList<>());
        User user5 = new User("user5", "5555555555", "user 5", 0, new ArrayList<>());
        userService.register(user1);
        userService.register(user2);
        userService.register(user3);
        userService.register(user4);
        userService.register(user5);
        userService.addFriend("user1", "user2");
        userService.addFriend("user1", "user3");
        userService.addFriend("user1", "user4");
        userService.addFriend("user1", "user5");

        System.out.println(userService.getUser("user1"));



    }
}