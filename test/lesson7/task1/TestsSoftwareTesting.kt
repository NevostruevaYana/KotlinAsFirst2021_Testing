package lesson7.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestsSoftwareTesting {

    private var INPUT_FILE_NAME = "input/substrs.txt"

    /**
     * Средняя (14 баллов)
     *
     * Во входном файле с именем inputName содержится некоторый текст.
     * На вход подаётся список строк substrings.
     * Вернуть ассоциативный массив с числом вхождений каждой из строк в текст.
     * Регистр букв игнорировать, то есть буквы е и Е считать одинаковыми.
     *
     */
    @Test
    fun testCountSubstrings() {
        assertEquals(
            mapOf(
                "нн" to 2, "-" to 6, "--" to 4, "еЕ" to 2, "ЖиВотНОе" to 2, "." to 2, "F" to 0,
                "\n)" to 2, "))\r\n" to 2, "И" to 5
            ),
            countSubstrings(
                "input/substrings_in2.txt",
                listOf("нн", "-", "--", "еЕ", "ЖиВотНОе", ".", "F", "\n)", "))\r\n", "И")
            )
        )
    }

}
