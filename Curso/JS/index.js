// function Account(name, document){
//   this.id
//   this.name = name
//   this.document = document
//   this.email
//   this.password
// }
// 
// 
// function Car(license, driver){
//   this.id
//   this.license = license
//   this.driver = driver
//   this.passenger
// }
// 
// Car.prototype.printDataCar = function(){
//   console.log("Licencia es: " + this.license + "| Driver: " + this.driver);
// }


let car1 = new Car("AW235", new Account("Andrés Herrera", "88800"))
car1.passenger = 4
car1.printDataCar()