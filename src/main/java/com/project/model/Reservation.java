package com.project.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "reservation")
public class Reservation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "id")
    Long id;
    @Column(name= "start_date", unique = false, nullable = false, length = 100)
    String startDate;
    @Column(name= "end_date", unique = false, nullable = false, length = 100)
    String endDate;
    @Column(name= "total_price")
    int price;

    @OneToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name="user_id", unique = false, referencedColumnName="app_user_id", insertable=false, updatable=false)
    private User user;
}
