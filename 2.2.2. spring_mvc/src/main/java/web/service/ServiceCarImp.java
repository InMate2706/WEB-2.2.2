package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceCarImp implements ServiceCar {

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car((long) 1, "audi", 1000));
        cars.add(new Car((long) 2, "skoda", 2000));
        cars.add(new Car((long) 3, "lexus", 1500));
        cars.add(new Car((long) 4, "bmw", 3400));
        return cars;
    }
}
