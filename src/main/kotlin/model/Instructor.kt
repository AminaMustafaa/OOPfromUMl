package model

class Instructor {
    private var nom: String
    private var anyExp : Int
    private var cotxe : Cotxe

    constructor(nom: String,anyExp : Int,cotxe : Cotxe){
        this.nom = nom
        this.anyExp = anyExp
        this.cotxe = cotxe
    }
    public fun getNom(): String{
        return this.nom
    }
    public fun assignarPracticas(alumne: Alumne,practica: Practica): Boolean{
        var practicasAssignadas : Boolean = false

        if(alumne.getTeorica()){
            practica.setAlumne(alumne)
            practicasAssignadas = true
        }
        return true

    }
    public fun consultarNombreTotalPracticas(practicas: MutableList<Practica>): Int{
       var numPracticas : Int = 0

        for(practica in practicas){
           var instructorPractica : Instructor
           instructorPractica = practica.getInstructor()
            if(instructorPractica.getNom() == this.nom){
                numPracticas++
            }

       }
        return numPracticas
    }
}