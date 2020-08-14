import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()
    var wynik = 0
    for (i in 1..x) {
        wynik = i * i
        if (wynik <= x) {
            println(wynik)
        }
    }
}