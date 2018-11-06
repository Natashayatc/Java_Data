/** Реализация Deque очереди
 * @version 1.0 05 ноября 2018
 * @author Natasha Yatcenya
 */
import java.util.LinkedList;

public class Deque {

    public static void main(String[] args) {
        java.util.Deque<String> dequeue = new LinkedList<>();
        dequeue.add("first");
        dequeue.add("last");

        // возвращает «последний», не удаляя его
        System.out.println(dequeue.peekLast());

        // удаляет и возвращает последний
        System.out.println(dequeue.pollLast());
    }
}
