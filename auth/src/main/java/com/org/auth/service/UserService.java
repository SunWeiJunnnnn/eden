package com.org.auth.service;

import com.org.auth.dao.UserDao;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Component
public class UserService {
    private static Set<UserDao> users = new HashSet<>();

    static {
        users.add(new UserDao(1, "Tom", 1, Date.valueOf(LocalDate.of(1992, 10, 20))));
        users.add(new UserDao(2, "Jack", 1, Date.valueOf(LocalDate.of(1993, 12, 18))));
        users.add(new UserDao(3, "Jerry", 1, Date.valueOf(LocalDate.of(1980, 7, 14))));
        users.add(new UserDao(4, "Han", 1, Date.valueOf(LocalDate.of(2001, 3, 4))));
        users.add(new UserDao(5, "Larry", 1, Date.valueOf(LocalDate.of(1976, 5, 2))));
    }

    public UserDao getUser(int userId) {
        UserDao user =
                users.stream().filter(userDao -> userDao.getInternalUserId() == userId).findFirst().orElse(null);
        return user;
    }

    public Set<UserDao> getUsers() {
        return users;
    }

    public synchronized UserDao addUser(UserDao userDao) {
        users.add(userDao);
        return userDao;
    }

    public boolean delete(int userId) {
        boolean remove = users.removeIf(user -> user.getInternalUserId() == userId);
        return remove;
    }

    public UserDao update(UserDao user) {
        Integer maxInternalUserId =
                users.stream().reduce((p, c) -> p.getInternalUserId() > c.getInternalUserId() ? p : c).map(UserDao::getInternalUserId).orElse(0);
        user.setInternalUserId(maxInternalUserId + 1);
        users.add(user);
        return user;
    }
}
