package com.project.controller;

import com.project.converter.CarDTOConverter;
import com.project.modelDTO.CarDTO;
import com.project.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/cars")
@CrossOrigin
public class CarController {


    private CarService carService;
    private CarDTOConverter carDTOConverter;

    public CarController(CarService carService, CarDTOConverter carDTOConverter){
        this.carService = carService;
        this.carDTOConverter = carDTOConverter;

    }

    @GetMapping
    @ResponseBody
    public List<CarDTO> getAllCars(){
        return carDTOConverter.entitiesToDTO(carService.getAllCars());
    }

}
