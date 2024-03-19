package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class MyController {
    private CarService service;

    public MyController(CarService service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String getCar(Model model, @RequestParam(value = "count",required = false) Integer count) {
        model.addAttribute("listCar", service.getCars (count));
        return "cars";
    }

}
