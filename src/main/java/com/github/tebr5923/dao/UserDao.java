package com.github.tebr5923.dao;

import com.github.tebr5923.model.User;

import java.util.List;

public interface UserDao {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User getUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
