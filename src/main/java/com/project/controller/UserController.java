package com.project.controller;


import com.project.converter.UserDTOConverter;
import com.project.modelDTO.UserDTO;
import com.project.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@Controller
@RestController
@RequestMapping("/api/users")
@CrossOrigin()
public class UserController {

    private UserService userService;
    private UserDTOConverter userDTOConverter;


    public UserController(UserService userService, UserDTOConverter userDTOConverter) {
        this.userService = userService;
        this.userDTOConverter = userDTOConverter;
    }

    @GetMapping
    @ResponseBody
    public List<UserDTO> getAllUsers(){
        return userDTOConverter.entitiesToDTO(userService.getAllUsers());
    }


    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @ResponseBody
    @ResponseStatus(NO_CONTENT)
    public ResponseEntity<?> delete(@PathVariable String id) {
        userService.deleteUser(Integer.parseInt(id));

        return ResponseEntity.ok().build();
    }
}
