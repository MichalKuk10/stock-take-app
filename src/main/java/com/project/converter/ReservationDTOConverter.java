package com.project.converter;

import com.project.model.Car;
import com.project.model.Reservation;
import com.project.modelDTO.CarDTO;
import com.project.modelDTO.ReservationDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReservationDTOConverter {

    public ReservationDTO convertEntityToDTO(Reservation reservation) {
        ReservationDTO reservationDTO = new ReservationDTO();

        reservationDTO.setId(reservation.getId());
        reservationDTO.setCarId(reservation.getCar().getId());
        reservationDTO.setRenterId(reservation.getUser().getId());
        reservationDTO.setStartDate(reservation.getStartDate());
        reservationDTO.setEndDate(reservation.getEndDate());
        reservationDTO.setReservationLengthInHours(reservation.getReservationLengthInHours());

        return reservationDTO;

    }

    public List<ReservationDTO> entitiesToDTO(List<Reservation> reservations) {
        return reservations.stream()
                .map(reservation -> convertEntityToDTO(reservation))
                .collect(Collectors.toList());

    }
}
