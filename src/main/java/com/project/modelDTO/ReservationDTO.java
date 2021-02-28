package com.project.modelDTO;

import com.project.model.Car;
import com.project.model.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReservationDTO {
    Long id;
    String startDate;
    String endDate;
    Long carId;
    Long renterId;
    int reservationLengthInHours;
}
