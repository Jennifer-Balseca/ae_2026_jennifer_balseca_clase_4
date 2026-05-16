fun main() {
    val name: String = "Ana"
    val email: String = "ana@gmail.com"
    val number: Int = 67
    //Ana -ana@gmail.com
    
    //y evitar agregacion de string, ocupa mucha ram a la larga:
    println(name + "-" + email)
    //siempre usar string templates ${}:
    println("$name - $email")
    
    //se pueden hacer cálculos steven con string pequeños
	println("Te faltan ${100 - number} para llegar a 100")
    
    
}