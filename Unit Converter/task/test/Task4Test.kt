
import org.hyperskill.hstest.testcase.CheckResult
import org.hyperskill.hstest.testcase.TestCase


/** TestCase, based on authors solution output. */
fun authorsCase(input: String, isPrivate: Boolean = false)
        = authorsCaseFromFun(::solveAuthors, input, isPrivate)

class Task4Test : ConverterTest<OutputClue>() {

    override fun generate(): List<TestCase<OutputClue>> {
        val l1 = listOf(
                // tests from the example
                authorsCase("1 kg to ounces\n" +
                        "2 meters in yards\n" +
                        "1 pound in kg\n" +
                        "exit\n"),

                authorsCase("1 oz to g\n" +
                        "100 cm in meters\n" +
                        "23.34 feet to in\n" +
                        "exit\n"),

                // my tests.
                // user doesn't handle errors here

                // custom separator
                authorsCase("10 kilograms convertPleaseTo GRAMS\nexit"),
                authorsCase("10 mm youConvertTo CM\nexit", true),

                // one kilogram
                authorsCase("1000 Grams to kg\nexit"),
                authorsCase("1000 mg to g\nexit", true),
                authorsCase("0.000001 kg to mg\nexit", true)
        )

        val weights = listOf(
                "g", "gram", "grams",
                "kg", "kilogram", "kilograms",
                "mg", "milligram", "milligrams",
                "lb", "pound", "POUNDS",
                "oz", "ounce", "ounces")

        val lastTest = weights
                // all combinations
                .flatMap { w1 -> weights.map { w2 -> w1 to w2 } }
                .map { (w1, w2) ->
                    "12.5 $w1 in $w2"
                }
                .joinToString("\n", postfix = "\nexit")
                .let { authorsCase(it) }

        return l1 + lastTest
    }

    override fun check(reply: String, clue: OutputClue): CheckResult {
        // compare the clue output and reply with our custom comparer.
        val checkResult = WordComparer(clue.output, reply).compare()

        if (clue.isPrivate)
            return checkResult.ciphered()
        return checkResult
    }
}
