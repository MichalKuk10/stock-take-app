package com.project.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.relational.core.sql.In;

import javax.persistence.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@Table(name = "reservations")
public class Reservation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "reservation_id")
    Long id;
    @Column(name = "start_date", unique = false, nullable = false, length = 100)
    String startDate;
    @Column(name = "end_date", unique = false, nullable = false, length = 100)
    String endDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private Car car;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @Column(name = "reservation_length_in_hours")
    int reservationLengthInHours;

    public Long getId(){
        return id;
    }


    
    public static final class Builder {
        private Long id;
        private String startDate;
        private String endDate;
        private int reservationLengthInHours;
        private Car car;
        private User user;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder reservationLengthInHours(int reservationLengthInHours) {
            this.reservationLengthInHours = reservationLengthInHours;
            return this;
        }

        public Builder car(Car car) {
            this.car = car;
            return this;
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }
    }



}
