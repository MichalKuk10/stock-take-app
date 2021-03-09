package com.project.service;

import com.project.dao.UserRepo;
import com.project.exception.MyCustomException;
import com.project.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers(){
       return  userRepo.findAll();
    }


    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }

    public void addUser(User user){
        userRepo.save(user);
    }

    public void updateUser(User user) {
        User existingUser = getUserById(user.getId());
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setAddress(user.getAddress());
        existingUser.setGender(user.getGender());
        existingUser.setPassword(user.getPassword());
        existingUser.setIsAdmin(user.getIsAdmin());
        userRepo.save(existingUser);
    }

    public User getUserById(long id) {
        return userRepo.getUserById(id);
    }

}
