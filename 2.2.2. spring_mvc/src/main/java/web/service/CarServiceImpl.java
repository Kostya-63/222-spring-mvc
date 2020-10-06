package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("CarServiceImpl")
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Импреза WRX STI", 280, "4WD"));
        cars.add(new Car("Lancer Evo IX", 291, "4WD"));
        cars.add(new Car("Celica GT-FOUR", 255, "4WD"));
        cars.add(new Car("Sport quattro S1", 450, "4WD"));
        cars.add(new Car("Alpine A110", 125, "RWD"));
    }

    @Autowired
    public CarServiceImpl() {
    }

    public List<Car> carListService(int n) {
        List<Car> newCarList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == cars.size()) {
                break;
            }
            newCarList.add(cars.get(i));
        }
        return newCarList;
    }
}