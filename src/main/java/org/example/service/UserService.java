package org.example.service;

import org.example.model.User;
import org.example.dao.UserDAO;

import java.util.List;

/**
 * Service layer for User business logic
 * Contains business rules and validation
 */
public class UserService {
    private final UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAO();
    }

    public User getUserById(int id) {
        // Add business logic here (validation, etc.)
        return userDAO.findById(id);
    }

    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    public boolean createUser(User user) {
        // Add validation logic here
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            return false;
        }
        return userDAO.save(user);
    }

    public boolean updateUser(User user) {
        return userDAO.update(user);
    }

    public boolean deleteUser(int id) {
        return userDAO.delete(id);
    }
}
