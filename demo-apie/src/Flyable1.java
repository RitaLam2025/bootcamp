import java.util.LinkedList;
import java.util.List;

public interface Flyable1 {
  void fly(); // polymorphism - take things from objects, eg, "fly", wrtie attribute from object, 

  // ! We need to create a class to implement Flyable, function is to provide the template
  // ! so that we can use the object of the class to invoke fly() method.

  public static void main(String[] args) {
    // ! create an object, that is able to invoke fly implementation without explicity writing a class.
    Flyable superman = new Flyable() {
    private String name = "John";
      
      @Override
      public void fly() {
        System.out.println("Superman is flying...");
      }
    };
    
    //!! this object is for one off usage.
    //!! not intend to reuse it (no need to open class)
    superman.fly();

    Flyable superman2 = new Flyable() {
      @Override
      public void fly() {
        System.out.println("Superman2 is flying.......");
      }
    };

    superman2.fly();

    List<Flyable> flyableObjects = new LinkedList<>();
    flyableObjects.add(superman);
    flyableObjects.add(superman2);
  }
}
