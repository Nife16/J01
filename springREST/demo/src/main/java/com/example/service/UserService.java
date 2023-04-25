package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserRepo;

@Service
public class UserService {
    
    @Autowired
    UserRepo userRepo;

    public User save(User user) {

        return userRepo.save(user);
    }

    public User findUserById(Integer id) {

        return userRepo.findById(id).get();

    }

    public void deleteUserById(Integer id) {
        userRepo.deleteById(id);
    }

    public User login(User user) throws Exception {

        user = userRepo.login(user.getEmail(), user.getPassword());

        if(user != null) {
            return user;
        }

        throw new Exception("Your email password combo did not exist. Try again.");

    }

    public User getUserByEmail(String email) throws Exception {

        User user = userRepo.getUserByEmail(email);

        if(user != null) {
            return user;
        }

        throw new Exception("Your email did not exist. Go log in.");
    }

    public User updateUser(User user) throws Exception {

        if(user.getId() != null ||
            findUserById(user.getId()) != null) {
                
            return save(user);

        }

        throw new Exception("Not a proper object, must have id or a existing id.");

    }

}
