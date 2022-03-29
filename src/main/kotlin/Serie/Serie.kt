package Serie

import Entregable.Entregable


class Serie: Entregable {

    var titulo : String = ""
    var numTemporadas: Int = 3
    var entregado : Boolean = false
    var genero : String = ""
    var creador : String = ""

    constructor(){}



    constructor(titulo : String, numTemporadas: Int, genero : String, creador : String ){
        this.titulo = titulo
        this.numTemporadas = numTemporadas
        this.genero = genero
        this.creador = creador
    }
    constructor(titulo: String, creador: String){
        this.titulo = titulo
        this.creador = creador
    }

    override fun entregar() {
        this.entregado = true
    }

    override fun devolver() {
       this.entregado = false
    }

    override fun isEntregado(): Boolean {
       return entregado
    }


}