package GLAB303_11_6HashMapandTreeMapProcessing;
import java.util.HashMap;
public class ExampletwoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> newHashMap = new HashMap<>();
        //  Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Samsung");
        newHashMap.put("Key3", "Apple");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original map contains:" + newHashMap);
        //  Getting size of Hashmap

    }
}
