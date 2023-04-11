package Curso.Java;

public class uberX extends Car{
  String brand;
  String model;
  
  public uberX(String license, Account driver, String brand, String model){
    super(license, driver);
    this.brand = brand;
    this.model = model;
  }
}
