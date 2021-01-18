package com.project.service;

import com.project.dao.CarRepository;
import com.project.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public CarRepository carRepository;

    public List<Car> getAllCars(){
        return new ArrayList<>();
    }
}
