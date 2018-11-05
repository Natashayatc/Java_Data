package Tree_Set;

public class Book implements Comparable<Book> {
    String name;
    int id;

    public Book(String name,int id) {
        this.name = name;
        this.id = id;
    }

    public int compareTo(Book b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}
