import java.util.Enumeration;
import java.util.Hashtable;
public class Hash_tableDemo {
    public static void main(String[] args) {
        Enumeration names;
        String key;
        Hashtable<String, String> hashtable =
                new Hashtable<String, String>();
        hashtable.put("Key1","Наталья");
        hashtable.put("Key2","Анастасия");
        hashtable.put("Key3","Дарья");
        hashtable.put("Key4","Мария");
        hashtable.put("Key5","Елизавета");

        names = hashtable.keys();
        while(names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " +key+ " & Value: " +
                    hashtable.get(key));
        }
    }
}

