package Slides_303_11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExamples {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("key", "value");
        stringMap.put("key2", "value2");
        stringMap.put("null", "actual value");
        stringMap.put("null value", "null");
        stringMap.put("null value 1", "null");

        //  this is adding null a 2nd time which will overwrite the existing value
        stringMap.put(null, "actual value 1234");

        //  it will overwrite a non null key as well
        stringMap.put("key", "value 1234");

        for (String key : stringMap.keySet()) {
            System.out.println(key + " == " + stringMap.get(key));
        }
    }
}
