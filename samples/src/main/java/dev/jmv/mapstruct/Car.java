package dev.jmv.mapstruct;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class Car {

    private String make;
    private int numberOfSeats;
    private int year;
    private CarType type;
    private Date launchDate;

}
