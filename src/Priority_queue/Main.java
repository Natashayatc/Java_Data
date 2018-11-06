/** Реализация приоритетной очереди
 * @version 1.0 05 ноября 2018
 * @author Natasha Yatcenya
 */
package Priority_queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args)
    {
        Comparator<String> comparator = new StringLengthComparator();
        PriorityQueue<String> queue =
                new PriorityQueue<String>(10, comparator);
        queue.add("кот");
        queue.add("собака овчарка");
        queue.add("рыбки");
        System.out.println("Начальная очередь"+ queue);
        queue.remove();
        System.out.println("Конечная очередь"+queue);
    }
}
