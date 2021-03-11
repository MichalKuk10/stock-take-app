package com.project.converter;

import com.project.model.Reservation;
import com.project.model.User;
import com.project.modelDTO.ReservationDTO;
import com.project.modelDTO.UserDTO;
import com.project.service.ReservationService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDTOConverter {

    private ReservationService reservationService;
    private ReservationDTOConverter reservationDTOConverter;

    public UserDTO convertEntityToDTO(User user){
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setGender(user.getGender());
        userDTO.setAddress(user.getAddress());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword("**********");
        userDTO.setIsAdmin(user.getIsAdmin());
        userDTO.setReservationsIds(user.getReservations()
                .stream()
                .map(Reservation::getId)
                .collect(Collectors.toList()));

        return userDTO;

    }



    public List<UserDTO> entitiesToDTO(List<User> users) {
        return users.stream()
                .map(user -> convertEntityToDTO(user))
                .collect(Collectors.toList());

    }
}
