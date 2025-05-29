import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("John");
    strings.add("Peter");
    strings.add("Lucas");
    System.out.println(strings.size());//3
    System.out.println(strings); //john, lucas, peter

    //the underlying data structure is not array.
    strings.remove("Peter"); // equals()

    //the difference between ArrayList and HashSet
    //1, no ordering (Hashset) 
    //2, natural avoid duplicated values (hashset)

    boolean result = strings.add("John;");
    System.out.println(result);// false
    System.out.println(strings);// [john, lucas]

    //isEmpty, contains, clear(),etc..same as ArrayList

    //Example: ArrayList<String>, "apple", "orange", "apple", "Lemon"
    //check if duplicated value exists: true /false

    ArrayList<String> fruits = new Arraylist<>(); // add can check duplicated or not// 
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("apple");
    fruits.add("lemon");

    //loop + hashset + add()
    boolean foundDuplicated = false;
    HashSet<String> fruitSet = new HashSet<>();
    for (String fruit : fruits) {
      if (!fruitSet.add(fruit)) {
        foundDuplicated = true;
        break;
      }

    }
    System.out.println("Found duplicated fruit:" + foundDuplicated);

    //arraylist 
      }
}
