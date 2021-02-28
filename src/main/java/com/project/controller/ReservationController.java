package com.project.controller;

import com.project.converter.ReservationDTOConverter;
import com.project.modelDTO.ReservationDTO;
import com.project.service.ReservationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.NO_CONTENT;

@Controller
@RestController
@RequestMapping("/api/reservations")
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
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

    @GetMapping(params="car")
    @ResponseBody
    public List<ReservationDTO> getReservationsByCarId(@RequestParam(value="car") long id){
        return reservationDTOConverter.entitiesToDTO(reservationService.getReservationsByCarId(id));
    }



    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @ResponseBody
    @ResponseStatus(NO_CONTENT)
    public ResponseEntity<?> delete(@PathVariable String id) {
        reservationService.deleteReservation(Integer.parseInt(id));

        return ResponseEntity.ok().build();
    }

}