package com.project.dao;

import com.project.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {

    @Query("Select r from Reservation r where r.car.id = :id")
    List<Reservation> findReservationsByCarId(long id);
}
