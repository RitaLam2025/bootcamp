public class Dog extends Animal { // inheritance, dog inherits from animal, gain access to method,
  private double weight; // kg, encapsulation, 封裝 dog gei weight (attribute), child class no relationship, only from parent class
  // java encapsulate the raw data, use java to disclose the data
  //car is one of machine , kind of sth 

  public Dog(double weight, int age) {
    super(age);// call to superclass constructor
    this.weight = weight;
  }

  //presentation - show what want to show in that return
  //getter
  public double getWeight() {
    return this.weight +2;
  }

  @Override
  public int getAge() {
    return -99;
  }
  public static void main(String[] args) {
    Dog dog = new Dog(3.5, 10);
    System.out.println(dog.getWeight());
    System.out.println(dog.getAge());
  }
    }

