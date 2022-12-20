package com.sda.carrental.web.mvc;

import com.sda.carrental.model.property.Car;
import com.sda.carrental.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("show")
public class CarController {


    private final CarService carService;
    @GetMapping
    public String showResults(final ModelMap map) {
        List<Car> cars = carService.findAll();
        map.addAttribute("department", cars);
        return "showResults";
    }
}