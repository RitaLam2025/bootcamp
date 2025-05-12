import java.math.BigDecimal;

// ! author of circle -> control access (Read/write) of circle
public class Circle {
  private double radius; 
  private String color;
  // private double area; // !! 因為可以計出來，violate OOP concept, as this can be calculated, not the raw data, so dont type this

  // constructor (All args constructor) - must write first, put the words inside the object
  // if i dont write the empty constructor,then i can use my default one
  // not write setname/ setter, then can use my below circle data , as i already gave them the figure

  public Circle (double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public 

  // Type of Method: Presentation 
  public double area() {
    return BigDecimal.valueOf(this.radius) //
          .multiply(BigDecimal.valueOf(this.radius)) //
          .multiply(BigDecimal.valueOf(Math.PI)) //
          .doubleValue();
  }

  public static double area2(double radius) {
    public double area2() {
      return BigDecimal.valueOf(radius) //
            .multiply(BigDecimal.valueOf(radius)) //
            .multiply(BigDecimal.valueOf(Math.PI)) //
            .doubleValue();
      
  }
// ! the user of the circle class -> convenient.
  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    System.out.println(c1.area()); // ~38.48, 3.5*

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
