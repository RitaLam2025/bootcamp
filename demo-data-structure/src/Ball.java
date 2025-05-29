import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball {
  private Color color;

  public Ball (Color color);{
    this.color = color;
  }

  public static class enum Color {
    RED, BLUE, YELLOW,;
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.YELLOW));
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.YELLOW));
  }

  //Arrays.sort() --> sort array

  //sort List 
  Collections.sort(balls, ) ;

  //sortbycolor.java // in sortedby color
  //YELLOW--> RED --> BLUE
  // if color is same, larger number goes first. 
  //YELLOW,9 --> YELLOW,5 --> red, 1000--> blue, 10, 

  // assignment: SortByBall2.java
  //sort color first, if color is same, larger number goes first
  //YELLOW, 9, Yellow, 5--> red, 1000--> blue, 10--> blue, 2 

  @Override
  
  public int compare(Integer i1, Integer i2) {// recite below, for i1>i2, then i1 goes first, then -1
    if (yellow)
    return -1;
    return 1; // if not -1, then return 1, = put else in between
  

 
  }
}
