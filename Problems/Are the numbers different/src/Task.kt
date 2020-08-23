import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x = scanner.nextInt()
    val y = scanner.nextInt()
    val z = scanner.nextInt()
    if (x != y && x != z && y != z)
        println("true")
    else {
        println("false")
    }
}