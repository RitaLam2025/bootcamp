import java.math.BigDecimal;

public class Circle {
  private double radius; 
  private String color;
  // private double area; // !! 因為可以計出來，violate OOP concept, as this can be calculated, not the raw data, so dont type this

  // constructor (All args constructor) - must write first, put the words inside the object

  public Circle (double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  // Type of Method: Presentation
  public double area() {
    return BigDecimal.valueOf(this.radius) //
          .multiply(BigDecimal.valueOf(this.radius)) //
          .multiply(BigDecimal.valueOf(Math.PI)) //
          .doubleValue();
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    System.out.println(c1.area()); //

    //c2--> 4.5 BLUE 
    // circle [] -> c1,c2
    Circle[] circles = new Circle[2];
    circles [0] = c2;
    circles [1] = c1;

    //use array to find c2's color --> get colour then need to write the getcolor.formula

    //use array to find c1's area

    Circle c2 = new Circle(4.5, "BLUE");
    System.out.println(c2.area());

  }
}
