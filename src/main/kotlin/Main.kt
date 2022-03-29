import Serie.Serie
import VideoJuego.VideoJuego

fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    // println("Program arguments: ${args.joinToString()}")

    var series = arrayOf<Serie>()
    var videoJuegos = arrayOf<VideoJuego>()

    var cont = 0
    var cont2 = 0

    val serie1 = Serie("Dracula", 1, "Terror", "Maycol")
    val serie2 = Serie("Arcane", 1, "Animacion", "Aaron")
    val serie3 = Serie("Naruto", 26, "Anime", "Masashi Kishimoto")
    val serie4 = Serie("Vikingos", 6, "Accion", "Justin")
    val serie5 = Serie("The Walking Dead", 10, "terror", "Robert Kirkman")

    val juego1 = VideoJuego("Zelda", 15, "Aventura", "Nintendo")
    val juego2 = VideoJuego("Valorant", 20, "Multijugador", "Riot")
    val juego3 = VideoJuego("God of War", 20, "Accion", "Sony")
    val juego4 = VideoJuego("Kindom Hearth", 20, "Aventura", "Nintendo")
    val juego5 = VideoJuego("Clash Royal", 30, "Movil", "SuperCell")

    series = series.plus(serie1)
    series = series.plus(serie2)
    series = series.plus(serie3)
    series = series.plus(serie4)
    series = series.plus(serie5)

    videoJuegos = videoJuegos.plus(juego1)
    videoJuegos = videoJuegos.plus(juego2)
    videoJuegos = videoJuegos.plus(juego3)
    videoJuegos = videoJuegos.plus(juego4)
    videoJuegos = videoJuegos.plus(juego5)

    serie1.entregar()
    serie3.entregar()
    serie5.entregar()

    juego1.entregar()
    juego3.entregar()
    juego5.entregar()


    for(i in videoJuegos.indices){
        if(videoJuegos[i].isEntregado()){
            cont ++
        }
    }
    for(j in series.indices){
        if (series[j].isEntregado()){
            cont2 ++
        }
    }
    println("Cantidad de entregas: ")
    println("Series ->$cont2   Videojuegos ->$cont")











}