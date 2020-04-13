package com.cwilliams.fathersrights.services;

import com.cwilliams.fathersrights.models.User;
import com.cwilliams.fathersrights.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository storage;

    @Autowired
    public UserService(UserRepository storage) {
        this.storage = storage;
    }

    public User findUser(Long UserId){
        return storage.getOne(UserId);
    }

    public User createUser(User user){
        return storage.save(user);
    }
    public boolean deleteUser(Long UserId){
        storage.deleteUserByUserId(UserId);
        return true;

    }
}
