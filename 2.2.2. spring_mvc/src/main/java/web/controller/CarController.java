package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCarImp;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "locale", required = false) String locale,
                          ModelMap model) {
        List<Car> cars = new ServiceCarImp().getCars();
        model.addAttribute("cars", cars);
        model.addAttribute("locale", locale);
        return "cars";
    }

}
