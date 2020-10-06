package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/cars")
    public String carTable(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Impresa WRX STI", 280, "4WD"));
        cars.add(new Car("Lancer Evo IX", 291, "4WD"));
        cars.add(new Car("Celica GT-FOUR", 255, "4WD"));
        cars.add(new Car("Sport quattro S1", 450, "4WD"));
        cars.add(new Car("Alpine A110", 125, "RWD"));

        CarService service = new CarService(cars);
        model.addAttribute("carsTable", service.carListService(count));
        return "/cars";
    }
}