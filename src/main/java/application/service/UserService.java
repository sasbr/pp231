package application.service;

import application.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getAllUsers();

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    User getUser(Long id);
}
