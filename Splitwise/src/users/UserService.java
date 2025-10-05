package users;

import java.util.Map;

public interface UserService {

    void register(User user);

    User getUser(String userId);

    void addFriend(String user1, String user2);
}
