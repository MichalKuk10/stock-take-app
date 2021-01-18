package com.project.modelDTO;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReservationDTO {
    int id;
    String startDate;
    String endDate;
    int carId;
    int renterId;
    int price;
}
