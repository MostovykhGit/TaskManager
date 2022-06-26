package testgroup.dao;

import testgroup.model.Task;
import testgroup.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserDao {
    Map<String, User> allUsers();

    void add(User user);
    User getByLogin(String login);
}
