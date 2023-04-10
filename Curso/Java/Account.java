package Curso.Java;

public class Account {
  int id;
  String name;
  String document;
  String email;
  String password;

  public Account(String nombre, String document){
    this.name = nombre;
    this.document = document;
  }
}