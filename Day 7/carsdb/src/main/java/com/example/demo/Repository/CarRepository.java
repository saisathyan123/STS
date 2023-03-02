package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Car;
@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
	public List<Car> findByOwners(int owners);
    public List<Car> findByAddress(String address);
    public List<Car> findByCarName(String carName);
    public List<Car> findByOwnersAndCarType(int owners, String CarType);
}
