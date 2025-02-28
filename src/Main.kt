import kotlin.math.min

fun main() {
    var codigo=0;
    var contador = 3;
    do {
        println("Ingrese el Codigo de acceso: ")
        codigo = readln().toInt()

        if (codigo>=1000&& codigo<=1999){
            println("""
             Acceso Concedido
             Bienvenido Empleado No. : "$codigo
        """.trimIndent())
            codigo = 3;
        }else if (codigo>=2000&&codigo<=2999){
            println("""
            Bienvenido VISITANTE
            
            INGRESE SU NOMBRE: 
        """.trimIndent())
            var nombre = readln()
            println("""
            $nombre  Ingrese el motivo de su visita en el Edificio: 
        """.trimIndent())
            var motivo = readln()
            println("""
            $nombre Acceso concedido en el Edificio por el motivo de: $motivo
        """.trimIndent())
            codigo = 3;
        }else {
            println(
                """
                Acceso Denegado
                Codigo Invalido..
                Le quedan $contador intentos para ingresar codigo valido
                De lo contrario se bloqueara el acceso..
            """.trimMargin())
            contador -= 1;
            var codigoAdmin=123;
            while (contador==-1){
                if (contador==-1){
                    println("SISTEMA BLOQUEADO, INGRESE EL CODIGO DE ADMIN PARA DESBLOQUEAR: ")
                    codigo =  readln().toInt();
                    if (codigo==codigoAdmin){
                        contador=3
                        println("SISTEMA DESBLOQUEADO POR EL ADMIN...")
                    }
                }
            }
        }
    }while (contador!=-2)
}









