package ru.utkin.spring.ProjectOnBoot.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.utkin.spring.ProjectOnBoot.model.User;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAllUsers() {
       return em.createQuery("SELECT u FROM User u", User.class).getResultList();

    }
    @Override
    public void saveUser(User user) {
        em.persist(user);
    }

    @Override
    public User getUserById(Long id) {

        return em.find(User.class,id);
    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }


    @Override
    public void deleteUser(Long id) {

        em.createQuery("DELETE FROM User u WHERE u.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

}
