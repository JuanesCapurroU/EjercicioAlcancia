import kotlin.math.min

fun main() {
    var contadorDado1 = 0;
    var contadorDado2=0;

    println("DADO 1: ")
                for (i in 1..10){
                    var min = 1;
                    var max =  6;
                    var Dado1 = (min..max).random()
                    contadorDado1+=Dado1
                    print("\t$Dado1")
                }
    println("\nDADO 2: ")
    for (i in 1..10){
        var min = 1;
        var max =  6;
        var Dado2 = (min..max).random()
        contadorDado2+=Dado2
        print("\t$Dado2")
    }

    if (contadorDado1>contadorDado2){
        println("\n")
        println(""" 
            El dado numero 1 saco $contadorDado1
            El dado numero 2 saco $contadorDado2
            Por tal motivo el ganador es el Dado numero 1
        """.trimIndent())
    }else {
        println("""
            El dado numero 1 saco $contadorDado1
            El dado numero 2 saco $contadorDado2
            Por tal motivo el ganador es el Dado numero 2
        """.trimIndent())
    }

            }





