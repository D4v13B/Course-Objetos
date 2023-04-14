package Curso.Java;

import java.util.ArrayList;
import java.util.Map;

public class uberVan extends Car{
  Map<String,Map<String, Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;
  private int passenger;
  
  public uberVan(String license, Account driver, int passenger, Map<String,Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
    super(license, driver, passenger);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial = seatsMaterial;
  }
  
  public uberVan(String license, Account driver, int passenger){
    super(license, driver, passenger);
  }

  @Override //Sobre escribiendo el metodo de la clase padre
  public void setPassenger(int passenger) {
    if(passenger == 6){
      this.passenger = passenger;
    }else{
      System.out.println("Necesitas 6 pasajeros");
    }
  }

}
