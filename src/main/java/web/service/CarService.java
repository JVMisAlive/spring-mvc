package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> carList = new ArrayList();

    public List<Car> getCarList() {
        carList.clear();
        carList.add(new Car("Mercedes-Benz", "Black", 111));
        carList.add(new Car("Volkswagen", "Green", 222));
        carList.add(new Car("BMW", "White", 333));
        carList.add(new Car("Opel", "Yellow", 444));
        return carList;
    }
}
