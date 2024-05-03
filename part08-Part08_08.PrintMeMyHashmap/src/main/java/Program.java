
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String keys : hashmap.keySet()) {
            System.out.println(keys);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String keys : hashmap.keySet()) {
            if (keys.contains(text)) {
                System.out.println(keys);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String keys : hashmap.keySet()) {
            if (keys.contains(text)) {
                System.out.println(hashmap.get(keys));
            }
        }
    }

}
