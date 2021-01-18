package com.project.controller;

import com.project.model.Car;
import com.project.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private CarService carService;

    public CarController(CarService carService){
        this.carService = carService;

    }

    @GetMapping
    @ResponseBody
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }
}
