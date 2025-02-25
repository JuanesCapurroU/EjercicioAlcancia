fun main() {
/*
En una alcancía es posible guardar monedas de las siguientes denominaciones: $20, $50, $100, $200 y $500,
 no se guardan ni billetes ni monedas de otras denominaciones.
  Al dueño de la alcancía le parece muy útil conocer cuánto tiene en la alcancía sin necesidad de romperla,
   es más, él quiere conocer cuántas monedas tiene en cada denominación para así romper la alcancía sólo cuando quiera
   disponer de todo su dinero ahorrado.
Se quiere un programa que ilustre el manejo de la alcancía.
El programa debe permitir (1) agregar una moneda de una de las denominaciones indicadas,
 (2) contar cuántas monedas tiene de cada denominación, (3) calcular el total de dinero ahorrado,
  (4) romper la alcancía vaciando su contenid
*/
    var veinte = 0;
    var cincuenta = 0;
    var cien = 0;
    var docientos = 0;
    var quinientos = 0
    var total = 0;
    var opcion = 0;
    var opcionMonedas = 0;

    do {


        println(
            """
        1. Agregar Mondeas
        2. Contar Cuantes Monedas Tiene
        3. Calcular el Total Ahorrado
        4. Romper la arcancia
    """.trimIndent()
        )

        opcion = readln().toInt()
        when (opcion) {
            1 -> {
                println(
                    """
                MENU DE INGRESO DE PLATA
                1. $20
                2. $50
                3. $100
                4. $200
                5. $500
            """.trimIndent()
                )
                opcionMonedas= readln().toInt()
                when (opcionMonedas) {
                    1 -> veinte += 1;
                    2 -> cincuenta += 1
                    3 -> cien += 1;
                    4 -> docientos += 1
                    5 -> quinientos += 1

                }
            }
            2 -> println("""
        Tienes $veinte monedas de 20${'$'}
        Tienes $cincuenta monedas de 20${'$'}
        Tienes $cien monedas de 100${'$'}
        Tienes $docientos monedas de 200${'$'}
        Tienes $quinientos monedas de 500${'$'}
            """.trimIndent())
            3-> {
               total= (veinte*20)+(cincuenta*50)+(cien*100)+(docientos*200)+(quinientos*500)
                println("""
                    El total que tienes ahorrado es: $total
                """.trimIndent())
            }
            4-> {println("""
                Alcancia desocupada, has retirado $total
            """.trimIndent())
            veinte = 0
                cincuenta= 0
                cien = 0
                docientos = 0
                quinientos = 0
                total = 0
            }
        }
        }while (opcion != 5)
}

