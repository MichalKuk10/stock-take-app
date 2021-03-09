package com.project.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;


import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "cars")
public class Car {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "car_id")
    Long id;
    @Column(name= "manufacturer")
    String manufacturer;
    @Column(name= "model")
    String model;   
    @Column(name= "registration")
    String registration;
    @Column(name= "is_service_required")
    boolean isServiceRequired;
    @Column(name= "tank_percentage")
    int tankPercentage;
    @Column(name= "price_per_hour")
    int pricePerHour;
    @OneToMany(mappedBy="car", cascade= CascadeType.ALL)
    List<Reservation> reservations;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", registration='" + registration + '\'' +
                ", isServiceRequired=" + isServiceRequired +
                ", tankPercentage=" + tankPercentage +
                ", pricePerHour=" + pricePerHour +
                ", reservations=" + reservations +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public boolean getIsServiceRequired() {
        return isServiceRequired;
    }

    public void setIsServiceRequired(boolean isServiceRequired) {
        this.isServiceRequired = isServiceRequired;
    }

    public int getTankPercentage() {
        return tankPercentage;
    }

    public void setTankPercentage(int tankPercentage) {
        this.tankPercentage = tankPercentage;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }
}

