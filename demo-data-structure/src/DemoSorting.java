import java.util.Arrays;

public class DemoSorting {
  public static void main(String[] args) {
    int [] arr = new int [] {3,7,-1, -80};
    // bubble sort (nested for loop) --> we dont use it in real life.
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    //custom ordering --> but the performance would be same as arrays.sort()
    //only how to arrange, but not base on speed
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
