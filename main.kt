fun main() {
    val grade: Int = 85
    
    if (grade > 70) {
        println("Aprobado")
    } else {
        println("Reprobado")
    }
    
    //se puede usar if como una expresión de variable
   	//se puede reducir y mejorar
    val results: String = if (grade > 70){
        "Aprobado"
    } else {
        "Reprobado"
    }
		
    println(results)
}