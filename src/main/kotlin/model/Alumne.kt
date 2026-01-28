package model

class Alumne {
    private var nom: String
    private var edat: Int
    private var teorica: Boolean
    private var quantPracticas: Int

    constructor(nom:String,edat:Int,teorica:Boolean,quantPracticas:Int){
        this.nom = nom
        this.edat = edat
        this.teorica = teorica
        this.quantPracticas = quantPracticas
    }

    public fun incrementarPracticas(){
        this.quantPracticas++
    }

    public fun getQuantPracticas(): Int{
        return this.quantPracticas
    }

    public fun aprovarTeorica(){
        if(!teorica){
            this.teorica = true
        }
    }
    public fun getTeorica(): Boolean{
        return this.teorica
    }

}