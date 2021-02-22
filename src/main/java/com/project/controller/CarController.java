package com.project.controller;

import com.project.converter.CarDTOConverter;
import com.project.model.Car;
import com.project.model.User;
import com.project.modelDTO.CarDTO;
import com.project.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

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

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @ResponseBody
    @ResponseStatus()
    public ResponseEntity<?> deleteCar(@PathVariable String id) {
        carService.deleteCar(Integer.parseInt(id));

        return ResponseEntity.ok().build();
    }


    @PostMapping()
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    @ResponseStatus(CREATED)
    public ResponseEntity<Object> attemptToAddUser(@RequestBody Car car) {
        carService.addCar(car);
        return ResponseEntity.status(CREATED).body("Account has been created.");
    }

}
