import model.*
import java.time.LocalDate

fun main() {
    var practicasAutoEscuela : MutableList<Practica> = mutableListOf()
    var paco: Instructor = Instructor("Paco",8, Cotxe("BMW", "S1",200,20f))
    var maria: Instructor = Instructor("Maria",10, Cotxe("BMW", "S1",200,20f))
    var dani: Alumne = Alumne("Dani",19,false,0)
    practicasAutoEscuela.add(Practica(
        dani, paco, LocalDate.now(),
        durada = TODO()
    ))
    practicasAutoEscuela.add(Practica(
        dani, maria, LocalDate.now(),
        durada = TODO()
    ))

}