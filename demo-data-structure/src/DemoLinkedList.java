import java.util.ArrayList;
import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    // !! Arraylist vs LinkedList (why java needs to make this two things)

    //Same:
    //1, with Ordering
    // 2, store a set of values


    //Difference:
    // 1, uderlying data strucure: array vs linkedlist
    // 2, scenario: get(), add(), remove()
    
    LinkedList<String> fruits = new LinkedList<>(); // think abt to use which data structure "arraylist" or "linkedlist" 
    fruits.add("apple");
    fruits.add("orange"); // apple --> point to orange
    fruits.add("apple"); // orange --> point to apple
    fruits.add("lemon"); // apple --> point to lemon
    System.out.println(fruits.size()); // 4
    System.out.println(fruits.get(1)); // orange
    fruits.remove(2);
    System.out.println(fruits); //[apple, orange, lemon]

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    if (fruits.contains("apple")) {

    }
    fruits.addFirst("watermelon");
  }
}
