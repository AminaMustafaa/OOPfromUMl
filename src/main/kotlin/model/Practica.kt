package model

import java.time.LocalDate

class Practica {
    private var alumne: Alumne
    private  var instructor: Instructor
    private var data: LocalDate
    private var durada: Int

    constructor(alumne: Alumne,instructor: Instructor,data: LocalDate,durada: Int){
        this.alumne = alumne
        this.instructor =instructor
        this.data = data
        this.durada = 0
    }
    public fun setDurada(durada: Int){
        this.durada = durada
    }
    public fun getAlumne():Alumne{
        return this.alumne
    }
    public fun setAlumne(alumne: Alumne){
        this.alumne = alumne
    }
    public fun getInstructor(): Instructor{
        return  this.instructor
    }

}