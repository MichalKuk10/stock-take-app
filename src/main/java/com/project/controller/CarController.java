package com.project.controller;

import com.project.converter.CarDTOConverter;
import com.project.modelDTO.CarDTO;
import com.project.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/cars")
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

//    @GetMapping("{/id}")
//    @ResponseBody
//    public List<CarDTO> getCarById(){
//        return carService.getAllCars()
//    }
}
