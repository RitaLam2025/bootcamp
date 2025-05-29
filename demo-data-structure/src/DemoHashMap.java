import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // A set of same type values; array, ArrayList, HashSet

    //Key -> Get a set of same type values
    //HashMap<Key,value>
    //Key + Value--> Entry (row)
    HashMap<String, String> fruitMap = new HashMap<>();
    fruitMap.put("A", "Apple"); // put one entry 
    fruitMap.put("O", "Orange"); // put one entry 
    fruitMap.put("L", "Lemon"); // put one entry 

    System.out.println(fruitMap.size()); // 3 entries
    System.out.println(fruitMap.get("A")); // apple
    System.out.println(fruitMap.get("X")); // null
    if (fruitMap.containsKey("A")) {

    }
    if (fruitMap.containsValue("Apple")) {

    }
    String removedValue = fruitMap.remove("0");
    System.out.println(removedValue);// Orange

    //Hashmap:
    // 1, No ordering

    //for-each loop
    for (Map.Entry<String,String> entry: fruitMap.entrySet()) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

    new LinkedHashMap<>() // if dont understand, then neglect
    // ** linkedList OR array only in java

  }
}
