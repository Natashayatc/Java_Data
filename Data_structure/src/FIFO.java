import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.offer("third");
        System.out.println("Начальная очередь"+ queue);
        // удаление верхнего элемента
        queue.remove();
        System.out.println("После удаления верхнего элемента"+ queue);


    }
}
