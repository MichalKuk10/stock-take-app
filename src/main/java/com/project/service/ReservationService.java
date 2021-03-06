package com.project.service;

import com.project.dao.CarRepo;
import com.project.dao.ReservationRepo;
import com.project.model.Car;
import com.project.model.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    public ReservationRepo reservationRepo;

    public ReservationService(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    public List<Reservation> getAllReservations(){
        return reservationRepo.findAll();
    }
    public List<Reservation> getReservationsByIds(List<Long> ids){
        return reservationRepo.findAllById(ids);
    }

    public List<Reservation> getReservationsByCarId(Long id){
        return reservationRepo.findReservationsByCarId(id);
    }

    public void deleteReservation(long id){
        reservationRepo.deleteById(id);
    }
}
