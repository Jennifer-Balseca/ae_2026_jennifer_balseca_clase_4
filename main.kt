//Operaciones Fundamentales
//FILTER
data class Student(
    val id: Long,
    val name: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun getStudents(): MutableList<Student>{ 
    val jorge = Student(
 		id = 1,
        name = "Jorge",
        email = "jorge@puce.edu.ec",
        grade = 8, 
        isActive = true
    ) 
    val ana = Student(
 		id = 2,
        name = "Ana",
        email = "ana@puce.edu.ec",
        grade = 6, 
        isActive = true
    ) 
    val juan= Student(
 		id = 3,
        name = "Juan",
        email = "juan@puce.edu.ec",
        grade = 9, 
        isActive = true
    ) 
    return mutableListOf(jorge, ana, juan) 
    //declaración de lista mutable
}

//firma de la función: 
//En este caso, la firma de getResults recibe un Int y devuelve un string

fun getResult(grade: Int): String {
    return if(grade>7) "Aprobado" else ""
}

fun main() { //Operacion de filtro para filtrar:
   val estudiantesEstudiosos: MutableList<Student> = mutableListOf()
   for (student in getStudents()){
       if(student.grade>7){
           estudiantesEstudiosos.add(student)
       }
   }
   println(estudiantesEstudiosos)
   
   //Forma optimizada usando op filter
   val estudiantesEstudiosos2: List<Student> = getStudents().filter { loQueSea ->
       loQueSea.grade > 7
       //lambda: expresión con anonimidad para ejecutar una línea de comando
       //loQueSea viene a ser el estudiante
       //Lambda en el caso del filtro, tiene un alias y un executable 
   }
	println(estudiantesEstudiosos2)
}
