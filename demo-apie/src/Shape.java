public abstract class Shape {
  private String Color;

  

  public abstract double area();

  public static void main(String[] args) {
    Shape shape1 = new Circle(3.5);
    System.out.println(shape1.area);
  }


}
