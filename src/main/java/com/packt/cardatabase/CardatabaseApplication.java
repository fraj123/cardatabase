package com.packt.cardatabase;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner{

  public static final Logger logger = 
    LoggerFactory.getLogger(CardatabaseApplication.class);

  @Autowired
  private CarRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(CardatabaseApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000));
    repository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000));
    repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000));

    // Fetch all cars and log to console
  }

}
