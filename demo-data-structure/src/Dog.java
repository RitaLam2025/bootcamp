import java.util.ArrayList;

import javax.swing.event.SwingPropertyChangeSupport;

public class Dog extends Animal implements Comparable<Dog>{
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  //this (-1) vs dog (1)  // need to write this
  @Override
  public int compareTo(Dog dog) {
    return this.name.compareTo(dog.getName()); > 0 ? -1 ; 1;
  }

  @Override
  public boolean equals(Object Obj) {
    if (this == obj)
    return true;
    if (!(obj instanceof Dog))
    return false;
    Dog dog = (Dog) obj;
    return this.name.equals(dog.getName());
  }

  // ! you should override equals (), 
  //! so that list.remove() able to remove the dog

  @Override
  public void walk() {
    System.out.println("Dog is walking..");
  }

  public static void main(String[] args) {
    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("Mary"));
    dogs.add(new Dog("Alex"));
    dogs.add(new Dog("Paul"));
  }

  //Comparable Approach; as long as dog implement comparable
  //disadvantage- every class has one sorting formula ONLY, but comparator approach can be more formula for a run 

  Collections.sort(dogs); // sorting use collections, 
  SwingPropertyChangeSupport
}
