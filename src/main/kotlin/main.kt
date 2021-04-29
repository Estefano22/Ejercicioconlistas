fun main() {

    var numerosAleatorio = 0
    var media = 0
    val listadelosNumeros = mutableListOf<Int>()

    val numerosMayoresoIguales: MutableList<Int> = mutableListOf()

    repeat (100){
        numerosAleatorio = (0..100).random()
        listadelosNumeros.add(numerosAleatorio)
        media += numerosAleatorio
    }
    media /= listadelosNumeros.size

    for (i in listadelosNumeros){

        // if con 2 condiciones
        if (i >=media && i%2==0) numerosMayoresoIguales.add(i)
        if (i >=media) if (i%2==0) numerosMayoresoIguales.add(i)
    }


    println("La media es: $media \n" )

    println("Numeros mayores o iguales que la media : $numerosMayoresoIguales")


    }

