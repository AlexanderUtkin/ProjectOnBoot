package ru.utkin.spring.ProjectOnBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.utkin.spring.ProjectOnBoot.dao.UserDao;
import ru.utkin.spring.ProjectOnBoot.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);

    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteUser(id);

    }
}
