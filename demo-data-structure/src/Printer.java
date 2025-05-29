// Java Generic 
// !! 1. less code/class during the complie time(you dont need to write StringPrinter, integerprinter)
// !! 2. you still need to define the T type during the runtime (Eg, main)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//E --> java for collection
// K, V--> java for map
//T,U,V
public class Printer<T> {
  private T value;

  public Printer(T value) {
    this.value = value;
  }

  public void print() {
    System.out.println(value);
  }

  public void setValue(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }
  public static void main(String[] args) {
    // Runtime: StringPrinter
    Printer<String> sp = new Printer<>("hello");
    // sp.setValue(100); // error, because you already defined T is string
    sp.setValue("goodbye");

    Printer<Integer> ip = new Printer<>(10);
    ip.setValue(1000);
    ip.print();//1000

    // ! you don't need to write StringArrayList, IntegerArrayList
    ArrayList<String> names = new ArrayList<>();
    names.add("Peter"); 
    //names.add(10);
  
    //Key = String, Value = List<Dog>
    HashMap<String, List<Dog>> dogMap = new HashMap<>();
    List<Dog> dogList1 = new LinkedList<>();
    dogList1.add(new Dog("John"));
    dogList1.add(new Dog("Peter"));
    dogMap.put("ABC", dogList1);

    List<Dog> dogList2 = new LinkedList<>();
    dogList1.add(new Dog("Lucas"));
    dogList1.add(new Dog("Oscar"));
    dogMap.put("XYZ", dogList2);
    System.out.println(dogMap.get("XYZ"));

    Printer<List<Dog>> dogListPrinter = new Printer<>(new LinkedList<>());
    dogListPrinter.getValue().add(new Dog("John"));
    dogListPrinter.getValue().add(new Dog("Peter"));
    dogListPrinter.print();
    

    
    

  }
}
