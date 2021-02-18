package com.project.controller;

import com.project.converter.ReservationDTOConverter;
import com.project.modelDTO.ReservationDTO;
import com.project.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/reservations")
@CrossOrigin
public class ReservationController {


    private ReservationService reservationService;
    private ReservationDTOConverter reservationDTOConverter;

    public ReservationController(ReservationService reservationService, ReservationDTOConverter reservationDTOConverter){
        this.reservationService = reservationService;
        this.reservationDTOConverter = reservationDTOConverter;
    }

    @GetMapping
    @ResponseBody
    public List<ReservationDTO> getAllCars(){

        return reservationDTOConverter.entitiesToDTO(reservationService.getAllReservations());
    }

}