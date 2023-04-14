package Curso.Java;;

public class uberPool extends Car {
  String model;
  String brand;

  public uberPool(String license, Account driver, String model, String brand, int passenger){
    super(license, driver, passenger);
    this.model = model;
    this.brand = brand;
  }
}
