package VideoJuego

import Entregable.Entregable

class VideoJuego : Entregable {

    var titulo : String = ""
    var horasEst : Int = 10
    var entregado: Boolean = false
    var genero: String = ""
    var compannia: String =""

    constructor(){}

    constructor(titulo : String, horasEst : Int ){
        this.titulo = titulo
        this.horasEst = horasEst
    }
    constructor(titulo : String, horasEst : Int,genero: String, compannia: String  ){
        this.titulo = titulo
        this.horasEst = horasEst
        this.genero = genero
        this.compannia = compannia
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