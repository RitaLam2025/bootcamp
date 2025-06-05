public class Ball { // ! Outer Class
  private Color color;

  public Ball(Color color) {
    this.color = color;
  }
  public Color getColor() {
    return this.color;
  }

  
  public static enum Color{ // !! Inner Class
    BLUE, RED, YELLOW,;

    public static void printValue() {
      
    }
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(Color.BLUE);
    System.out.println(b1.getColor());
    Ball b2 = new Ball(Color.BLUE);
    System.out.println(b2.getColor());
    
    Ball.Color.printValue();
  }
}
