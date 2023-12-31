package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCar;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private ServiceCar car;

    public CarsController(ServiceCar car) {
        this.car = car;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(value = "count") int count) {

        model.addAttribute("cars", car.getCars(count));
        return "cars";
    }
}
