package com.packt.cardatabase.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long>{
  
  // Fetch data by brand
  List<Car> findByBrand(String brand);

  // Fetch data by color
  List<Car> findByColor(String color);

  // Fetch data by year
  List<Car> findByYears(int years);
  
  // Fetch data by brand and model
  List<Car> findByBrandAndModel(String brand, String model);

  // Fetch data by brand or color
  List<Car> findByBrandOrColor(String brand, String color);

  // Fetch cars by brand and sort by year
  List<Car> findByBrandOrderByYearsAsc(String brand);

}
