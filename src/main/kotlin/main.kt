fun main() {

    var numerosAleatorio = 0
    val listadelosNumeros = mutableListOf<Int>()
    var media : Double = 0.0
    val numerosMayoresoIguales: MutableList<Int> = mutableListOf()

    repeat (100){
        numerosAleatorio = (0..100).random()
        listadelosNumeros.add(numerosAleatorio)
        media += numerosAleatorio
        media /= listadelosNumeros.size
    }
    for (i in listadelosNumeros){
        if (i >= media) numerosMayoresoIguales.add(i)

    }

    println("La media es: $media \n" )

    println("Numeros mayores o iguales que la media : \n $numerosMayoresoIguales \n")


    }

