package lesson7.task1;

import com.pholser.junit.quickcheck.Property;
import edu.berkeley.cs.jqf.fuzz.JQF;
import org.junit.runner.RunWith;

import java.util.List;

import static lesson7.task1.FilesKt.countSubstrings;


@RunWith(JQF.class)
public class FuzzingTests {

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
    @Property(trials = 1000)
    public void testCountSubstrings(List<String> substrings) {
        countSubstrings("input/substrings_in2.txt", substrings);
    }

}