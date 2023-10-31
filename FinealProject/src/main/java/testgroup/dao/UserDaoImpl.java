package testgroup.dao;

import testgroup.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UserDaoImpl implements UserDao{
    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<String, User> users = new HashMap<>();

    @Override
    public Map<String, User> allUsers() {
        return this.users;
    }

    @Override
    public void add(User user) {
        user.setId(AUTO_ID.getAndIncrement());
        users.put(user.login, user);
    }
    @Override
    public User getByLogin(String login) {
        return users.get(login);
    }
}
