package com.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "car")
public class Car {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "id")
    int id;
    @Column(name= "brand_name")
    String brandName;
    @Column(name= "car_id")
    String carId;
    @Column(name= "rent")
    String rent;
    @Column(name= "service")
    String service;
    @Column(name= "fuel")
    int fuel;

}

//    CREATE TABLE Car(user_id serial PRIMARY KEY,
//    brand_name VARCHAR ( 50 ) UNIQUE NOT NULL,
//    car_id INT NOT NULL,
//    rent VARCHAR ( 50 ) NOT NULL,
//    service VARCHAR ( 55 ) UNIQUE NOT NULL,
//    fuel INT NOT NULL);
