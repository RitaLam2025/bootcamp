public class AnimalHelper2 {
  private Animal animal; 

public void setAnimal(Animal animal) {
  this.animal = animal;
}

public static

// AnimalHelper<Animal> -> AnimalHelper2
// AnimalHelper<dog> -->AnimalHelper3
public static void main(String[] args) {
  AnimalHelper<Animal> animalHelper1 = new AnimalHelper<>()
  animalHelper1.setAnimal(new Bird());
  animalHelper1.setAnimal(new Dog("John"));

  AnimalHelper<Dog> animalHelper2 = new AnimalHelper();
  animalHelper2.setAnimal(new Dog("Peter"))


}




}

