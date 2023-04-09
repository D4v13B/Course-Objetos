function nuevoPerro(id,nombre,raza,altura){
  this.id = id
  this.nombre = nombre
  this.raza = raza
  this.altura = altura
}

nuevoPerro.prototype.balk = function(){
  
}

let miPerro = new nuevoPerro(8,"coco","criollo","mediano")
let perroMama = new nuevoPerro(9,"Charlie","Doberman","Grande")

console.log(miPerro)
console.log(perroMama)

//------------------------------------------------

