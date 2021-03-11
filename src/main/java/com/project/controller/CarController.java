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
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public class CarController {


    private CarService carService;
    private CarDTOConverter carDTOConverter;

    public CarController(CarService carService, CarDTOConverter carDTOConverter){
        this.carService = carService;
        this.carDTOConverter = carDTOConverter;

    }

    @GetMapping
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")

    public List<CarDTO> getAllCars(){
        return carDTOConverter.entitiesToDTO(carService.getAllCars());
    }

    @GetMapping("/{id}")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    public CarDTO getCarById(@PathVariable("id") long id){
        return carDTOConverter.convertEntityToDTO(carService.getCarById(id));
    }

    @GetMapping
    @RequestMapping("/ids")
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    public List<String> getAllCarsIds(){
        return carService.getCarsIds();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    @ResponseStatus()
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    public ResponseEntity<?> deleteCar(@PathVariable String id) {
        carService.deleteCar(Integer.parseInt(id));

        return ResponseEntity.ok().build();
    }

    @PutMapping()
    @ResponseBody
    @ResponseStatus(NO_CONTENT)
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    public ResponseEntity<Object> attemptToUpdateCar(@RequestBody Car car) {
        carService.updateCar(car);
        return ResponseEntity.status(NO_CONTENT).body("Car details have been updated.");
    }

    @PostMapping()
    @ResponseBody
    @ResponseStatus(CREATED)
    @CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
    public ResponseEntity<Object> attemptToAddUser(@RequestBody Car car) {
        carService.addCar(car);
        return ResponseEntity.status(CREATED).body("Account has been created.");
    }

}
