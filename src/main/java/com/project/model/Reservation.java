package com.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "reservation")
public class Reservation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "id")
    int id;
    @Column(name= "start_date")
    String startDate;
    @Column(name= "end_date")
    String endDate;
    @Column(name= "car_id")
    int carId;
    @Column(name= "renterer_id")
    int renterId;
    @Column(name= "total_price")
    int price;
}
