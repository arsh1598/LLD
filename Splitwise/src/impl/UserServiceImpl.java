package impl;

import Repo.UserRepo;
import users.User;
import users.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    Map<String, User> userMap = UserRepo.getInstance().getUserMap();
    @Override
    public void register(User user) {
        this.userMap.put(user.getUserId(), user);
    }

    @Override
    public User getUser(String userId) {
        return this.userMap.getOrDefault(userId, null);
    }

    @Override
    public void addFriend(String user1, String user2){
        User user = this.userMap.get(user1);
        User friend = this.userMap.get(user2);
        List<String> friendList1 = user.getFriends();
        List<String> friendList2 = friend.getFriends();
        friendList1.add(user2);
        friendList2.add(user1);
        user.setFriends(friendList1);
        friend.setFriends(friendList2);
    }
}
