package com.project.converter;

import com.project.model.Car;
import com.project.model.Reservation;
import com.project.modelDTO.CarDTO;
import com.project.service.ReservationService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDTOConverter {

    private ReservationService reservationService;
    private ReservationDTOConverter reservationDTOConverter;


    public CarDTO convertEntityToDTO(Car car){
        CarDTO carDTO = new CarDTO();

        carDTO.setId(car.getId());
        carDTO.setManufacturer(car.getManufacturer());
        carDTO.setModel(car.getModel());
        carDTO.setRegistration(car.getRegistration());
        carDTO.setReservationsIds(car.getReservations()
                .stream()
                .map(Reservation::getId)
                .collect(Collectors.toList()));
        carDTO.setIsServiceRequired(car.getIsServiceRequired());
        carDTO.setTankPercentage(car.getTankPercentage());
        carDTO.setPricePerHour(car.getPricePerHour());

        return carDTO;

    }

    public Car convertDTOToCar(CarDTO carDTO){
        Car car = new Car();

        car.setId(carDTO.getId());
        car.setManufacturer(carDTO.getManufacturer());
        car.setModel(carDTO.getModel());
        car.setRegistration(carDTO.getRegistration());
//        car.setReservations(reservationService.getReservationsByIds(carDTO.getReservationsIds()));
        car.setIsServiceRequired(carDTO.getIsServiceRequired());
        car.setTankPercentage(carDTO.getTankPercentage());

        return car;
    }


    public List<CarDTO> entitiesToDTO(List<Car> cars) {
        return cars.stream()
                .map(car -> convertEntityToDTO(car))
                .collect(Collectors.toList());
    }


}
