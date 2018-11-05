import java.util.Stack;

public class LIFO {
    public static void main(String[] args) {
        Stack stack = new Stack();
        // добавляем значения в стек
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Начальный стек: " + stack);
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Удаляем: " + stack.pop());
        System.out.println("Добавление  значений 6,7,8 в стек");
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println("Конечный стек: " + stack);
    }
}
