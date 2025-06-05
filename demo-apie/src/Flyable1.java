public class Flyable1 {
  void fly();

  // ! We need to create a class to implement Flyable,
  // ! so that we can use the object of the class to invoke fly() method.

  public static void main(String[] args) {
    Flyable superman = new Flyable() {
      @Override
      public void fly() {
        System.out.println("Superman is flying");
      }
    };
  }
}
