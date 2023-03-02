package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Car;
import com.example.demo.Repository.CarRepository;

@Service
public class CarService {
@Autowired
CarRepository rep;
public String addCar(Car car)
{
	rep.save(car);
	return "True";
}
public List<Car> getCar()
{
	return rep.findAll();
}
}
