package testgroup.service;

import testgroup.model.User;

import java.util.HashMap;
import java.util.Map;

public interface UserService {
    Map<String, User> allUsers();
    void add(User user);
    User getByLogin(String login);
}
