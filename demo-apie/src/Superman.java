public class Superman extends Human implements Flyable { // parent has the method, then override , override to double check the method from the parent
// extend "noun" - 物件 , implement "verb"

  public Superman(String name) {
    super(name);
  }

  @Override
  public void fly() { // method is fly, so commit the contract
   System.out.println("I am flying....");
  }

  @Override
  public void eat() { // method is eat, so commit the contract
    System.out.println("I am eating....");
   }

   @Override
   public void drink() { // method is , so commit the contract
     System.out.println("I am drinking....");
    }
  public static void main(String[] args) {
    Superman s1 = new Superman("John");
    s1.fly();
    s1.eat();
    s1.walk();


    Flyable something = new Superman("Peter");
    something.fly(); //polymorphism

    //hide the method of eat()
    // something.eat();
    // something.drink();

    Superman s2 = (Superman) something;
    s2.eat();

    Living s3 = new Superman("Steven");



  }
}
