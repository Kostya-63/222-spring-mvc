package web.model;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    List<Car> cars = new ArrayList<>();

    public CarService() {
    }

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> carListService(int n) {
        List<Car> newCarList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == cars.size()) { break; }
            newCarList.add(cars.get(i));
        }
        return newCarList;
    }
}