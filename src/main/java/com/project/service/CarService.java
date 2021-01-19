package com.project.service;

//import com.project.dao.CarRepository;
import com.project.dao.CarRepository;
import com.project.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CarService {

   public CarRepository carRepository;

    public CarService() {
    }

    public List<Car> getAllCars(){
      return carRepository.findAll();

    }
}
