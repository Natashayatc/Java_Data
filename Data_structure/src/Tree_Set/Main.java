package Tree_Set;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> set=new TreeSet<Book>();


        Book b1=new Book("Наталья", 15);
        Book b2=new Book("Сергей", 2);
        Book b3=new Book("Николай", 20);
        Book b4=new Book("Мария", 10);

        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        for(Book b:set){
            System.out.println(b.name+" "+b.id);
        }
    }
}
