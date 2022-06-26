package testgroup.service;

import testgroup.dao.UserDao;
import testgroup.dao.UserDaoImpl;
import testgroup.model.User;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class UserServiceImpl implements UserService {
    private UserDaoImpl userDao = new UserDaoImpl();

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);

    @Override
    public Map<String, User> allUsers() {
            User user1 = new User();
            user1.setId(AUTO_ID.getAndIncrement());
            user1.setName("root");
            user1.setSurname("root");
            user1.setLogin("root");
            user1.setPassword("root");
            userDao.allUsers().put(user1.login, user1);
        return userDao.allUsers();
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User getByLogin(String login) {
        return userDao.getByLogin(login);
    }
}
