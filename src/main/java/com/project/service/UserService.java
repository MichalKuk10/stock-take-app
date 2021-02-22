package com.project.service;

import com.project.dao.UserRepo;
import com.project.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<User> getAllUsers(){
       return  userRepo.findAll();
    }

    public void deleteUser(long id){
        userRepo.deleteById(id);
    }

    public void addUser(User user){
        userRepo.save(user);
    }
}
