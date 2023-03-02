package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Car;
import com.example.demo.Repository.CarRepository;
import com.example.demo.Service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	CarService service;
	@Autowired
	CarRepository rep;

	@PostMapping("")
	public String create(@RequestBody Car car) {
		return service.addCar(car);
	}

	@GetMapping("")
	public List<Car> findCars() {
		return service.getCar();
	}

	@GetMapping("/owners/{owners}")
	public List<Car> getByOwners(@PathVariable int owners) {
		return rep.findByOwners(owners);
	}

	@GetMapping("/address/{address}")
	public List<Car> getByAddress(@PathVariable("address") String address) {
		System.out.println("test");
		return rep.findByAddress(address);
	}

	@GetMapping("/carName/{carName}")
	public List<Car> getByCarName(@PathVariable String carName) {
		return rep.findByCarName(carName);
	}

	@GetMapping("/owners/{owners}/carType/{carType}")
	public List<Car> getByOwnerandCarType(@PathVariable int owners, @PathVariable String carType) {
		return rep.findByOwnersAndCarType(owners, carType);
	}

}
