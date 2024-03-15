package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {
    private List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Car("Honda", "Civic", 2021));
        carList.add(new Car("Ford", "Mustang", 2019));
        carList.add(new Car("Chevrolet", "Silverado", 2022));
        carList.add(new Car("Nissan", "Altima", 2021));
    }

    public List<Car> getCars(int count) {
        if (count >= carList.size() || count <= 0) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
