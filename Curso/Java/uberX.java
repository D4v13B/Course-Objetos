package Curso.Java;

public class uberX extends Car{
  String brand;
  String model;
  
  public uberX(String license, Account driver, String brand, String model, int passenger){
    super(license, driver,passenger);
    this.brand = brand;
    this.model = model;
  }
  
  @Override
  void printDataCar() {
    super.printDataCar();
    System.out.println("Model: " + model + " Brand: " + brand);
  }
  
}