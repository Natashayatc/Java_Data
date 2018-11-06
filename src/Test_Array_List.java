/** Реализация ArrayList
 * @version 1.0 05 ноября 2018
 * @author Natasha Yatcenya
 */
import java.util.ArrayList;

public class Test_Array_List {

    public static void main(String[] args) {
        ArrayList arlTest = new ArrayList();
        System.out.println("Размер ArrayList: " + arlTest.size());
        arlTest.add("А");
        arlTest.add("Б");
        arlTest.add("В");
        arlTest.add("Г");
        System.out.println("Размер ArrayList после добавления элементов: " + arlTest.size());
        System.out.println("Все элементы: " + arlTest);
        arlTest.remove("D");
        System.out.println("После удаление элемента: " + arlTest);
        arlTest.remove(2);
        System.out.println("После удаления элемента по инжексу: " + arlTest);
       //Содержит ли список "В"
        System.out.println(arlTest.contains("В"));
    }
}
