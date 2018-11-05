import java.util.HashSet;
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        System.out.println("Содержит ли HashSet '1'? " + myHashSet.contains(1));
        System.out.println("Содержит ли HashSet '11'? " + myHashSet.contains(11));

    }
}
