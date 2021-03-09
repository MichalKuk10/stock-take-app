package com.project.modelDTO;

import com.project.model.Reservation;

import javax.persistence.Column;
import java.util.List;

public class CarDTO {

    private Long id;
    private String manufacturer;
    private String model;
    private String registration;
    private List<Long> reservationsIds;
    private boolean isServiceRequired;
    private int tankPercentage;
    private int pricePerHour;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isServiceRequired() {
        return isServiceRequired;
    }

    public void setServiceRequired(boolean serviceRequired) {
        isServiceRequired = serviceRequired;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    private int pricePerHour(){
        return pricePerHour;
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

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public List<Long> getReservationsIds() {
        return reservationsIds;
    }

    public void setReservationsIds(List<Long> reservationsIds) {this.reservationsIds = reservationsIds;}

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

}
