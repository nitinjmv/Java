package dev.jmv.mapstruct;

public class MainClass {

    public static void main(String[] args) {
//        Car car = new Car("Volvo", 7, CarType.SUV);
        Car car = Car.builder()
                .type(CarType.SUV)
                .make("Volvo")
                .numberOfSeats(7)
                .build();
        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);
        System.out.println(carDto);

        CarDto carDto1 = CarDto.builder()
                .make("BMW")
                .seatCount(5)
                .type(CarType.SEDAN.toString())
                .build();
        Car car1 = CarMapper.INSTANCE.carDtoToCar(carDto1);
        System.out.println(car1);

    }
}
