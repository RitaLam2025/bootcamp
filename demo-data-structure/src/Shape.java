public abstract class Shape {
  public abstract double area();

  public static <T extends Shape> double totalArea(List<T> shape) {
    return -1;
  }
  public static double totalArea2(List<Shape> shape) {
    return -1;
  }

  //Circle, rectangular
  public static void main(String[] args) {
    List<Shape> shapes = new LinkedList<>();
    shapes.add(new Circle());
    shapes.add(new Circle());
    shapes.add(new Rectangular());

    Shape.totalArea(null);// List<Circles>, List<Rectangular>, List<Shape>
    Shape.totalArea2(null); //List<Shape>
  }
  
  class Circle extends Shape {
    private double area() {
      return 2
    }
  }

  public radius 

  @Override


  
}
