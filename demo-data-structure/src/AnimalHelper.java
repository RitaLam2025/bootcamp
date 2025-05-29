// ! < T extends Animal>, means T can be animal, or its child class.
public class AnimalHelper <T extends Animal>{
  private T animal;

  public void setAnimal(T animal) {
    this.animal = animal;
  }

  //In static method, any generic type is independent,
  // not referring to the class T.
  public static <U extends Animal> void walk (U animal) {
    animal.walk(); // polymorphism, because"Extend animal" ensures object can call Animal methods
  }
}
public static void main (String[] args) {
  AnimalHelper<Animal> animalHelper1 = new AnimalHelper<>();
  animalHelper1.setAnimal(new Bird());
  animalHelper1.setAnimal(new Dog("John"));

  AnimalHelper<Dog> animalHelper2 = new AnimalHelper<>();

  // In static method, the generic type of parameters is independent
  // not referring to the class T

  //Static generic method ** 
  AnimalHelper.walk(new Bird());
  



}


