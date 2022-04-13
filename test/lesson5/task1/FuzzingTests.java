package lesson5.task1;

import com.pholser.junit.quickcheck.Property;
import edu.berkeley.cs.jqf.fuzz.JQF;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;

import static lesson5.task1.MapKt.containsIn;
import static lesson5.task1.MapKt.extractRepeats;

@RunWith(JQF.class)
public class FuzzingTests {

    /**
     * Простая (2 балла)
     * <p>
     * Определить, входит ли ассоциативный массив a в ассоциативный массив b;
     * это выполняется, если все ключи из a содержатся в b с такими же значениями.
     * <p>
     * Например:
     * containsIn(mapOf("a" to "z"), mapOf("a" to "z", "b" to "sweet")) -> true
     * containsIn(mapOf("a" to "z"), mapOf("a" to "zee", "b" to "sweet")) -> false
     */
    @Property(trials = 1000)
    public void testContainsIn(Map<String, String> a, Map<String, String> b) {
        containsIn(a, b);
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
    @Property(trials = 1000)
    public void testExtractRepeats(List<String> list) {
        extractRepeats(list);
    }
}