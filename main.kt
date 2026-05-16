
  //hay muchos tipos de clases, vamos a usar mucho =data class : abstracción que nos sirve para representar múltiples valores a un solo objeto
  //construcción de la clasefuncion por defecto que permite crear una nueva instancia de la clase

data class Student(
    val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun main() {
    //creación de instancias de clases:
    val jorge = Student(
 		id = 1,
        name = "Jorge",
        email = "jorge@puce.edu.ec",
        grade = 8, 
        isActive = true
    ) //no importa el orden del contructor, lo importante es que esté todo lo que pide
    
    val ana = Student(1, "Ana", "ana@puce.edu.ec", 10, true) //si se usa una instancia simple si hay que respetar el orden del constructor
    println(ana)
    println(jorge)
   
}