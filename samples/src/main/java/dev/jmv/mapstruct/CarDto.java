package dev.jmv.mapstruct;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class CarDto {

    private String make;
    private int seatCount;
    private String type;
    private String launchDate;
}
