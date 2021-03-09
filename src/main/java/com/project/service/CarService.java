package com.project.service;

//import com.project.dao.CarRepository;
import com.project.dao.CarRepo;
import com.project.model.Car;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

   public CarRepo carRepo;

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public List<Car> getAllCars(){return carRepo.findAll();}

    public void deleteCar(long id){
        carRepo.deleteById(id);
    }

    public Car getCarById(long id) { return carRepo.getItemById(id); }

    public void addCar(Car car){
        carRepo.save(car);
    }

    public void updateCar(Car car){
        carRepo.save(car);
    }

    public List<String> getCarsIds(){
        return carRepo.findAll().stream()
                .map(car -> car.getRegistration())
                .collect(Collectors.toList());
    }

}
