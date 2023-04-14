package Curso.Java;

public class Main {
  public static void main(String[] args) {
    uberX car1 = new uberX("123QWE", new Account("David", "8-1018-2139", "a", "a"), "Chevrolet", "Sonic", 1);
    car1.setPassenger(4);
    car1.printDataCar();

    uberVan car2 = new uberVan("123GTY", new Account("David", "8-1075-2358", "moncho021509@gmail.com", "monchillo24"), 1);
    car2.setPassenger(6);
    car2.printDataCar();


    // Car car2 = new Car("12355", new Account("Andrés", "8-214142-123"));
    // car2.printDataCar();


    // Car car2 = new Car("123fg", "David");
    // car2.license = "qw1234";
    // car2.passenger = 3;
    // car2.printDataCar();
  }
}