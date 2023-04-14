package Curso.Java;

public class Account {
  int id;
  String name;
  String document;
  String email;
  String password;

  public Account(String nombre, String document, String email, String password){
    this.name = nombre;
    this.document = document;
    this.email = email;
    this.password = password;
  }
}