package lesson6.task1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TestsSoftwareTesting {

    /**
     * Средняя (5 баллов)
     *
     * Результаты спортсмена на соревнованиях в прыжках в длину представлены строкой вида
     * "706 - % 717 % 703".
     * В строке могут присутствовать числа, черточки - и знаки процента %, разделённые пробелами;
     * число соответствует удачному прыжку, - пропущенной попытке, % заступу.
     * Прочитать строку и вернуть максимальное присутствующее в ней число (717 в примере).
     * При нарушении формата входной строки или при отсутствии в ней чисел, вернуть -1.
     */
    @Test
    fun testBestLongJump() {
        assertEquals(-1, bestLongJump(""))
        assertEquals(717, bestLongJump("706 - % 717 % 703"))
        assertEquals(999, bestLongJump("706 - % 717 % 999"))

        assertEquals(-1, bestLongJump("706 - %% 717 % 703"))
        assertEquals(-1, bestLongJump("706 -- % 717 % 703"))
        assertEquals(-1, bestLongJump("- - % - %"))
        assertEquals(Int.MAX_VALUE, bestLongJump("- - % - " + Int.MAX_VALUE + " %"))

        // реализация в отношении пробелов вроде бы совпадает с описанным заданием:
        // ...
        // В строке могут присутствовать числа, черточки - и знаки процента %, разделённые пробелами;
        // ...
        // Числа, знаки и пробелы могут быть разделены пробелАМИ (> 1)
        // Про пробелы в начле и конце строки ничего не сказано -
        // в реализации они делают ошибочной всю строку
        assertEquals(-1, bestLongJump("706 о - % 717 % 703"))
        assertEquals(717, bestLongJump("706   - % 717 %       703"))
        assertEquals(-1, bestLongJump("     706  - % 717 % 703"))
        assertEquals(-1, bestLongJump("706  - % 717 % 703       "))

        assertEquals(-1, bestLongJump("abc"))
        assertEquals(-1, bestLongJump("- - - % 2147483649")) //Int.MAX_VALUE + 1

        // ERROR
        // не учтено наличие отрицательных чисел (результат спортсмена должен быть >0)
        //assertEquals(-1, bestLongJump("- - 45 - % -34"))
        //assertEquals(-1, bestLongJump("- - - % " + Int.MIN_VALUE))
    }

}
