package com.sda.carrental.service;

import com.sda.carrental.model.property.Car;
import com.sda.carrental.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public List<Car> findAll() {
        return StreamSupport.stream(carRepository.findAll().spliterator(), false)      //nowa klasa StreamSupport
                .collect(toList());
    }

    //TODO
    public List<Car> findUnreservedCars() {
        return StreamSupport.stream(carRepository.findAll().spliterator(), false)
                .collect(toList());
    }

    public List<Car> findUnreservedCars(LocalDate ddateFrom, LocalDate ddateTo, Long ddepartment){
        return StreamSupport.stream(carRepository.findUnreservedByDateAndDepartment(ddateFrom, ddateTo, ddepartment).spliterator(), false).collect(Collectors.toList());
    }

//    public List<Car> findReservedCarsByCustomerId(Long customerId){
//        return StreamSupport.stream(carRepository.findReservedByCustomerId(customerId).spliterator(), false).collect(Collectors.toList());
//    }
}