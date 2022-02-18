import java.util.HashMap;
import java.util.Map;
public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap();
        myMap.put("Hello", 1);
        if (!myMap.containsKey("World")) {
            myMap.put("World", 2);
        }
        myMap.put("!", -1);
        for (String key: myMap.keySet()){
            System.out.println("KeySet (key,value): " + key + ", " + myMap.get(key));
        }
        myMap.replace("World", 3);
        myMap.replace("!", 3);
        for (Map.Entry<String, Integer> entry: myMap.entrySet()){
            System.out.println("EntrySet (key,value): " + entry.getKey() + ", " + entry.getValue());
        }
        for (Integer value: myMap.values()) {
            System.out.println("Values (value): " + value);
        }
        System.out.println("Contains key \"Hi\": " + myMap.containsKey("Hi"));
        System.out.println("Contains key \"Hello\": " + myMap.containsKey("Hello"));
        System.out.println("Contains value \"3\": " + myMap.containsValue(3));
        System.out.println("Contains value \"100\": " + myMap.containsValue(100));
        myMap.remove("World", 3);
        myMap.remove("!");
        System.out.println("Size: " + myMap.size());
        System.out.println("Empty: " + myMap.isEmpty());
    }
}
