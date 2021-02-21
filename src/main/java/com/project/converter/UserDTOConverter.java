package com.project.converter;

import com.project.model.Reservation;
import com.project.model.User;
import com.project.modelDTO.ReservationDTO;
import com.project.modelDTO.UserDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDTOConverter {



    public UserDTO convertEntityToDTO(User user){
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setAddress(user.getAddress());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword("**********");

        return userDTO;

    }



    public List<UserDTO> entitiesToDTO(List<User> users) {
        return users.stream()
                .map(user -> convertEntityToDTO(user))
                .collect(Collectors.toList());

    }
}
