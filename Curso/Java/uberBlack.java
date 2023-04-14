package Curso.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map; 

public class uberBlack extends Car {
  //Map<String, ArrayList<String, Integer>>typeCarAccepted;
  Map<String,Map<String, Integer>> typeCarAccepted = new HashMap<>();
  ArrayList<String> seatMaterial;

  public uberBlack(String license, Account driver, Map<String, ArrayList<Pair<String, Integer>>> typeCarAccepte, int passenger){
    super(license, driver, passenger);
  }

}