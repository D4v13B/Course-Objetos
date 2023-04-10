package Curso.Java;

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("123QWE", new Account("David", "8-1018-2139"));
    car1.printDataCar();

    Car car2 = new Car("12355", new Account("Andrés", "8-214142-123"));
    car2.printDataCar();


    // Car car2 = new Car("123fg", "David");
    // car2.license = "qw1234";
    // car2.passenger = 3;
    // car2.printDataCar();
  }
}