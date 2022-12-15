package com.github.tebr5923.service;

import com.github.tebr5923.model.User;

import java.util.List;

public interface UserService {

    void createUsersTable();

    void dropUsersTable();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User getUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
