public class DemoWrapper {
  public static void main(String[] args) {
    // 8 primitives
    // int --> integer
    // 8 primitive + 8 wrapper class + 1 string = 17 types 

    int x = 3;
    Integer x1 = 3;

    byte b = 4;
    Byte b1 = 4;

    short s = 9;
    Short s1 = 9;

    long l = 8L;
    Long l1 = 8L;

    char c = 'a';
    Character c1 = 'a';

    boolean n = true;
    Boolean n1 = true;

    float f = 1.03f;
    Float f1 = 1.03f;

    double d = 1.99;
    Double d1 = 1.99;

    String s2 = "hello";

    // !! primitive va wrapper class
    // 1, primitives for value storage & maths operation only
    // 2, wrapper class has methods
    // 3. wrapper class never use Operators (>, <, > =, <=. ! , ==) for comparison
    
    // integer as an example below, string use words to compare
    System.out.println(x1.doubleValue());// 3.0
    System.out.println(x + x1); // int + integer --> int + int // ! dont write this
    Integer x2 = 10;

    // value comparison (compare To, equals)
    System.out.println(x2.compareTo(x1)); // 1 (x2 > x1) // LHS compare with RHS n give the value -1
    Integer x3 = 10;
    System.out.println(x2.compareTo(x3));  //
    System.out.println(x2.equals(x1));// false

    //maths operation
    System.out.println(x1 + x2); // 13
    System.out.println(x3 * x2);

    System.out.println(Long.valueOf(5).compareTo(Long.valueOf(3)));
    //string use word to cip



  }
}
