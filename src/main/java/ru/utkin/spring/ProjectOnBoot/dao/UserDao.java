package ru.utkin.spring.ProjectOnBoot.dao;



import ru.utkin.spring.ProjectOnBoot.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUserById(Long id);
    public void updateUser(User user);
    public void deleteUser(Long id);
}
