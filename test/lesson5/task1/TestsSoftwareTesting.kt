package lesson5.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestsSoftwareTesting {

    /**
     * Простая (2 балла)
     *
     * Определить, входит ли ассоциативный массив a в ассоциативный массив b;
     * это выполняется, если все ключи из a содержатся в b с такими же значениями.
     *
     * Например:
     *   containsIn(mapOf("a" to "z"), mapOf("a" to "z", "b" to "sweet")) -> true
     *   containsIn(mapOf("a" to "z"), mapOf("a" to "zee", "b" to "sweet")) -> false
     */
    @Test
    fun testContainsIn() {
        assertTrue(
            containsIn(
                mapOf("a" to "z"),
                mapOf("a" to "z", "b" to "sweet")
            )
        )
        assertTrue(
            containsIn(
                emptyMap(),
                emptyMap()
            )
        )
        assertTrue(
            containsIn(
                emptyMap(),
                mapOf("a" to "z", "b" to "sweet")
            )
        )
        assertTrue(
            containsIn(
                mapOf("b" to "c", "c" to "b", "a" to "z"),
                mapOf("a" to "z", "b" to "c", "c" to "b")
            )
        )
        assertFalse(
            containsIn(
                mapOf("b" to "c"),
                mapOf("c" to "b")
            )
        )
        assertFalse(
            containsIn(
                mapOf("b" to "c"),
                emptyMap()
            )
        )
    }

    /**
     * Средняя (4 балла)
     *
     * Найти в заданном списке повторяющиеся элементы и вернуть
     * ассоциативный массив с информацией о числе повторений
     * для каждого повторяющегося элемента.
     * Если элемент встречается только один раз, включать его в результат
     * не следует.
     *
     * Например:
     *   extractRepeats(listOf("a", "b", "a")) -> mapOf("a" to 2)
     */
    @Test
    fun testExtractRepeats() {
        assertEquals(
            emptyMap<String, Int>(),
            extractRepeats(emptyList())
        )
        assertEquals(
            mapOf("a" to 2),
            extractRepeats(listOf("a", "b", "a"))
        )
        assertEquals(
            emptyMap<String, Int>(),
            extractRepeats(listOf("a", "b", "c", "d"))
        )
        assertEquals(
            mapOf("a" to 2, "b" to 2),
            extractRepeats(listOf("a", "b", "b", "a"))
        )
        assertEquals(
            mapOf("b" to 2, "a" to 2),
            extractRepeats(listOf("a", "b", "b", "a"))
        )
        assertNotEquals(
            mapOf("a" to 1),
            extractRepeats(listOf("a"))
        )
    }
}
