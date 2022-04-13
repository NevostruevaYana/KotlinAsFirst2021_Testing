package lesson6.task1;

import com.pholser.junit.quickcheck.Property;
import edu.berkeley.cs.jqf.fuzz.JQF;
import org.junit.runner.RunWith;

import static lesson6.task1.ParseKt.bestLongJump;


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
    @Property(trials = 10000)
    public void testBestLongJump(String jumps) {
        bestLongJump(jumps);
    }

}