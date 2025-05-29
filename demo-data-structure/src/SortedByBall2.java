
public class SortedByBall2 implements Comparator<Ball> {
}
  // assignment: SortByBall2.java//
  //sort color first, if color is same, larger number goes first
  //YELLOW, 9, Yellow, 5--> red, 1000--> blue, 10--> blue, 2

  @Override
  public int compare(Ball o1, Ball o2) {
    if (o1.getColor() == o2.getColor()) {
      return o1.getNumber() > o2.getNumber() ? -1 : 1;
    }
    if (o1.getColor() == Ball.Color.YELLOW)
    return -1
  }