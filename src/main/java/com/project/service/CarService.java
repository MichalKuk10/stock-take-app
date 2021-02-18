package com.project.service;

//import com.project.dao.CarRepository;
import com.project.dao.CarRepo;
import com.project.model.Car;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class CarService {

   public CarRepo carRepo;

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public List<Car> getAllCars(){
      return carRepo.findAll();

    }
}
