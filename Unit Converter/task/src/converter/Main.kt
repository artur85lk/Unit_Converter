package converter

import java.util.*
fun mtom (liczbaD:Double): String{
    var przeliczanie = liczbaD * 1
    var wynik = ""
    when {
        liczbaD == 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD meter is $przeliczanie meters"
        liczbaD != 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD meters is $przeliczanie meter"
        liczbaD != 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD meters is $przeliczanie meters"
        liczbaD == 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD meter is $przeliczanie meter"
    }
    return wynik
}
fun kmtom (liczbaD:Double): String{
    var przeliczanie = liczbaD * 1000
    var wynik = ""
    when {
        liczbaD == 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD kilometer is $przeliczanie meters"
        liczbaD != 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD kilometers is $przeliczanie meter"
        liczbaD != 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD kilometers is $przeliczanie meters"
        liczbaD == 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD kilometer is $przeliczanie meter"
    }
    return wynik
}
fun cmtom (liczbaD:Double): String{
    var przeliczanie = liczbaD / 100
    var wynik = ""
    when {
        liczbaD == 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD centimeter is $przeliczanie meters"
        liczbaD != 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD centimeters is $przeliczanie meter"
        liczbaD != 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD centimeters is $przeliczanie meters"
        liczbaD == 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD centimeter is $przeliczanie meter"
    }
    return wynik
}
fun mmtom (liczbaD:Double): String {
    var przeliczanie = liczbaD / 1000
    var wynik = ""
    when {
        liczbaD == 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD millimeter is $przeliczanie meters"
        liczbaD != 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD millimeters is $przeliczanie meter"
        liczbaD != 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD millimeters is $przeliczanie meters"
        liczbaD == 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD millimeter is $przeliczanie meter"
    }
    return wynik
}
fun mitom (liczbaD:Double): String{
    var przeliczanie = liczbaD * 1609.35
    var wynik = ""
    when {
        liczbaD == 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD mile is $przeliczanie meters"
        liczbaD != 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD miles is $przeliczanie meter"
        liczbaD != 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD miles is $przeliczanie meters"
        liczbaD == 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD mile is $przeliczanie meter"
    }
    return wynik
}
fun ydtom (liczbaD:Double): String{
    var przeliczanie = liczbaD * 0.9144
    var wynik = ""
    when {
        liczbaD == 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD yard is $przeliczanie meters"
        liczbaD != 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD yards is $przeliczanie meter"
        liczbaD != 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD yards is $przeliczanie meters"
        liczbaD == 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD yard is $przeliczanie meter"
    }
    return wynik
}
fun fttom (liczbaD:Double): String{
    var przeliczanie = liczbaD * 0.3048
    var wynik = ""
    when {
        liczbaD == 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD foot is $przeliczanie meters"
        liczbaD != 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD feet is $przeliczanie meter"
        liczbaD != 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD feet is $przeliczanie meters"
        liczbaD == 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD foot is $przeliczanie meter"
    }
    return wynik
}
fun intom (liczbaD:Double): String{
    var przeliczanie = liczbaD * 0.0254
    var wynik = ""
    when {
        liczbaD == 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD inche is $przeliczanie meters"
        liczbaD != 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD inches is $przeliczanie meter"
        liczbaD != 1.0 && przeliczanie != 1.0 -> wynik = "$liczbaD inches is $przeliczanie meters"
        liczbaD == 1.0 && przeliczanie == 1.0 -> wynik = "$liczbaD inche is $przeliczanie meter"
    }
    return wynik
}

fun main() {
    while (true) {
        print("Enter what you want to convert (or exit): ")
    val wprowadzenie = readLine()!!.toLowerCase()
    var liczba = ""
    var liczbaD: Double = 0.0
    var liczbaI: Int

    var jednostka = ""
    for (i in wprowadzenie) {
        when (i) {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.' -> liczba += i.toString()
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'r', 's', 't', 'u', 'w', 'y', 'z' -> jednostka += i.toString()
        }
    }
    for (j in liczba) {                            //sprawdza i konwertuje do Double
        if (j == '.') {
            liczbaD = liczba.toDouble()
        } else {
            liczbaD = liczba.toDouble()
        }
    }

    when (jednostka) {                                    // sprawdza jednostkę
        "m", "meter", "meters" -> println(mtom(liczbaD))
        "km", "kilometer", "kilometers" -> println(kmtom(liczbaD))
        "cm", "centimeter", "centimeters" -> println(cmtom(liczbaD))
        "mm", "millimeter", "millimeters" -> println(mmtom(liczbaD))
        "mi", "mile", "miles" -> println(mitom(liczbaD))
        "yd", "yard", "yards" -> println(ydtom(liczbaD))
        "ft", "foot", "feet" -> println(fttom(liczbaD))
        "in", "inch", "inches" -> println(intom(liczbaD))
    }
    // ubrać w pętle nieskączoną
    // wyciągnąć spacje i podzielić słowo
    // dopisać jednostki
    // sprowadzić do kg
    // sprowadzić do wybranej jednostki
   }
}
