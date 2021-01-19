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
    @Column(name= "start_date", unique = false, nullable = false, length = 100)
    String startDate;
    @Column(name= "end_date", unique = false, nullable = false, length = 100)
    String endDate;
    @Column(name= "total_price")
    int price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;

    @OneToOne(optional=false)
    @JoinColumn(name="user_id", referencedColumnName="app_user_id", insertable=false, updatable=false)
    private User user;
}
