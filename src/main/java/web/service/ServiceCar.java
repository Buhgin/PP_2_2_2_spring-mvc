package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceCar {
    private List<Car> cars = List.of(
            new Car("BMV", "black", 5),
            new Car("Audi", "white", 3),
            new Car("Lada", "red", 1),
            new Car("Mercedes", "black", 6),
            new Car("Toyota", "white", 2)
    );

    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            count = 5;
        }

        return cars.subList(0, count);
    }


}
