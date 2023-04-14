package Curso.Java;

public class Car {
  private int id;
  private String license;
  private Account driver;
  private int passenger;

  public Car(String license, Account driver, int passenger){
    this.license = license;
    this.driver = driver;
    this.passenger = passenger;
  }

  void printDataCar(){
    System.out.println("License: " + license + "| Driver: " + driver.name + 
    " Passenger " + passenger + " ");
  }

//--------------------------------------------- ----
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Account getDriver() {
    return driver;
  }

  public void setDriver(Account driver) {
    this.driver = driver;
  }

  public int getPassenger() {
    return passenger;
  }

  public void setPassenger(int passenger) {
    if(passenger == 4){
      this.passenger = passenger;
    }else{
      System.out.println("Necesitas 4 pasajeros");
    }
  }

  

  
}