import java.util.Vector;

public class Vector_Demo {
    public static void main(String[] args) {
        Vector vector = new Vector();

        vector.add("1");
        vector.add("2");
        vector.add("3");
        System.out.println("Начальный vector: ");
        System.out.println(vector);
        System.out.println("Начальный размер vector: " + vector.size());
        vector.add("4");
        vector.add("5");
        System.out.println("Конечная вместимость vector " + vector.capacity());
    }
}

