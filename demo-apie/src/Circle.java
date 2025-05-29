public class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public static void main(String[] args) {
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = o1;

    // !! Object.class has equals(), hashCode(), toString()!!

    // ! 1, equals()
    System.out.println(o1.equals(o2)); //false
    System.out.println(o1.equals(o3)); //true
    // ! 2, hashCode()
    System.out.println(o1.hashCode());//
    System.out.println(o2.hashCode());
    System.out.println(o3.hashCode());
    //! 3, toString()
    System.out.println(o1.toString());
    System.out.println(o2.toString());
    System.out.println(o3.toString());

    Card c1 = new Card ('A', 'D');
    Card c2 = new Card ('A', 'D');
    System.out.println(c1.equals(c2)); //false, if it is using Object.equals(), we do not override in Card.class
    // ! object.equals() is checking address
    //true, if you re-define Card.equals()

    //the definition of hashCode() always same as equals()
    System.out.println(c1.hashCode()); //
    System.out.println();
  }

  // equals (), hashCode(), toString()
}
