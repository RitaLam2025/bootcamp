// Inherit 
public class Animal { // Parent Class: concrete class or abstract class 
  private int age; 

  // ! Why abstract class still have constructor? for trial class constructor to call 
  public Animal (int age) {
    this.age = age;
  }
  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Animal animal = new Cat ("John",13);
    Cat cat = new Cat("Peter", 17);

    //Abstract class is not for object creation, dont let the system to make a new animal 
    //Abstract lock the possibility, flexibility of class 

    // ! abstract class is not for object creation 
    Animal animal2 = new Animal(13);

    //!! polymorphism (Runtime/dynamic Polymorphism)指針可指向多面體
    // !! 1, instance method call is determined by object reference type (eg, animal) (compile-time)
    // !! 2, the implementation of method is determined by actual object itself (runtime)
    Animal cat2 = new Cat("John", 20); // left hand side - put abstract, RHS - put the concrete class
    //"cat2" -->"Object reference"
    //"animal"-->"object reference type" // as only get Age, so can't get name
    // "new cat"("John",20)"-->"object" / "object reference value"

    cat2 = new Dog(10,7);
    System.out.println(cat2.getAge()); // 99 , as overrided - java cannot ensure cat2 is pointing to Cat Object, it may be Dog object,so it refers to getAge, as animal has age to refer to
    System.out.println();
    //! 組合SKILLS- instanceOf+downcast
    if (cat2 instanceof Cat) {
      Cat animal2 = (Cat) cat2;
      System.out.println(animal2.getName());
    } else if (cat2 instanceof Dog) {
      Dog animal3 = (Dog) cat2;
      System.out.println(animal3.getWeight()); //10 
    }

    ((Cat) cat2).getName();

  }
  
}
