package com.project.converter;

import com.project.model.Car;
import com.project.modelDTO.CarDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDTOConverter {


    public CarDTO convertEntityToDTO(Car car){
        CarDTO carDTO = new CarDTO();

        carDTO.setId(car.getId());
        carDTO.setBrandName(car.getBrandName());
        carDTO.setCarId(car.getCarId());
        carDTO.setRent(car.getRent());
        carDTO.setService(car.getService());
        carDTO.setFuel(car.getFuel());

        return carDTO;

    }

    public Car convertDTOToCar(CarDTO carDTO){
        Car car = new Car();

        car.setCarId(carDTO.getCarId());
        car.setBrandName(carDTO.getBrandName());
        car.setCarId(carDTO.getCarId());
        car.setRent(carDTO.getRent());
        car.setFuel(carDTO.getFuel());
        car.setService(carDTO.getService());

        return car;
    }


    public List<CarDTO> entitiesToDTO(List<Car> cars) {
        return cars.stream()
                .map(car -> convertEntityToDTO(car))
                .collect(Collectors.toList());
    }


}
