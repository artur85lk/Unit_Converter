package converter

fun wordFirst(x:Double, y:String):String {
    //val liczba = x.toInt()
    val first = x
    var jednostka = "pp"
    if (first == 1.0) {
        when {
            y == "kg" || y == "kilogram" || y == "kilograms" -> jednostka = "kilogram" // dopisać warunki (wynik pojedycz, mnogi i jednostka)
            y == "g" || y == "gram" || y == "grams" -> jednostka = "gram"
            y == "mg" || y == "milligram" || y == "milligrams" -> jednostka = "milligram"
            y == "lb" || y == "pound" || y == "pounds" -> jednostka = "pound"
            y == "oz" || y == "ounce" || y == "ounces" -> jednostka = "ounce"
        }
    } else {
        when {
            y == "kg" || y == "kilogram" || y == "kilograms" -> jednostka = "kilograms" // dopisać warunki (wynik pojedycz, mnogi i jednostka)
            y == "g" || y == "gram" || y == "grams" -> jednostka = "grams"
            y == "mg" || y == "milligram" || y == "milligrams" -> jednostka = "milligrams"
            y == "lb" || y == "pound" || y == "pounds" -> jednostka = "pounds"
            y == "oz" || y == "ounce" || y == "ounces" -> jednostka = "ounces"
        }
    }
    return jednostka
}

fun wordLast(y: String, b: Double):String {
    val liczba = y
    //val first = y
    var jednostka = "pp"
    if (b == 1.0) {
        when {
            y == "kg" || y == "kilogram" || y == "kilograms" -> jednostka = "kilogram" // dopisać warunki (wynik pojedycz, mnogi i jednostka)
            y == "g" || y == "gram" || y == "grams" -> jednostka = "gram"
            y == "mg" || y == "milligram" || y == "milligrams" -> jednostka = "milligram"
            y == "lb" || y == "pound" || y == "pounds" -> jednostka = "pound"
            y == "oz" || y == "ounce" || y == "ounces" -> jednostka = "ounce"
        }
    } else {
        when {
            y == "kg" || y == "kilogram" || y == "kilograms" -> jednostka = "kilograms" // dopisać warunki (wynik pojedycz, mnogi i jednostka)
            y == "g" || y == "gram" || y == "grams" -> jednostka = "grams"
            y == "mg" || y == "milligram" || y == "milligrams" -> jednostka = "milligrams"
            y == "lb" || y == "pound" || y == "pounds" -> jednostka = "pounds"
            y == "oz" || y == "ounce" || y == "ounces" -> jednostka = "ounces"
        }
    }
    return jednostka
}
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
        //var liczbaI: Int
        var wordsList: List<String> = wprowadzenie.split(" ") //podział wprowadzenia
        //println(wordsList[0])

        var firstNumber = 0.0
        var wynik = 0.0
        var wordFirst = wordFirst(wordsList[0].toDouble(), wordsList[1])


        var jednostka = ""
        val wordtoDouble = wordsList[0].toDouble()
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
        when (wordsList[1]) {
            "g", "gram", "grams" -> firstNumber = wordsList[0].toDouble()
            "kg", "kilogram", "kilograms" -> firstNumber = wordsList[0].toDouble() * 1000
            "mg", "milligram", "milligrams"  -> firstNumber = wordsList[0].toDouble() * 0.001
            "lb", "pound", "pounds" -> firstNumber = wordsList[0].toDouble() * 453.592
            "oz", "ounce", "ounces" -> firstNumber = wordsList[0].toDouble() * 28.3495
        }
        when (wordsList[3]) {        //wynik
            "g", "gram", "grams" -> wynik = firstNumber
            "kg", "kilogram", "kilograms" -> wynik = firstNumber / 1000
            "mg", "milligram", "milligrams"  -> wynik = firstNumber / 0.001
            "lb", "pound", "pounds" -> wynik = firstNumber / 453.592
            "oz", "ounce", "ounces" -> wynik = firstNumber / 28.3495
        }
        var wordLast = wordLast(wordsList[3], wynik)
        println("$wordtoDouble $wordFirst is $wynik $wordLast")
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
        // zmienić nazwy jednostek do pełnej nazwy
        val characters = arrayOf('a', 'z', 'e', 'd')
   }
}
