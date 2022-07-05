package com.packt.cardatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String brand;
  private String model;
  private String color;
  private String registerNunber;
  private int year;
  private int price;

  public Car() { }

  public Car(String brand, String model, String color, String registerNunber, int year, int price) {
    super();
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.registerNunber = registerNunber;
    this.year = year;
    this.price = price;
  }
  
  public long getId() {
      return id;
  }

  public void setId(long id) {
      this.id = id;
  }

  public String getBrand() {
      return brand;
  }

  public void setBrand(String brand) {
      this.brand = brand;
  }

  public String getModel() {
      return model;
  }

  public void setModel(String model) {
      this.model = model;
  }

  public String getColor() {
      return color;
  }

  public void setColor(String color) {
      this.color = color;
  }

  public String getRegisterNunber() {
      return registerNunber;
  }

  public void setRegisterNunber(String registerNunber) {
      this.registerNunber = registerNunber;
  }

  public void setYear(int year) {
      this.year = year;
  }

  public int getYear() {
      return year;
  }

  public int getPrice() {
      return price;
  }

  public void setPrice(int price) {
      this.price = price;
  }
  
}
