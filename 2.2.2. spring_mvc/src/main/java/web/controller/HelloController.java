package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    private final CarService service;

    public HelloController(CarServiceImpl service) {
        this.service = service;
    }

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

        model.addAttribute("carsTable", service.carListService(count));
        return "/cars";
    }
}