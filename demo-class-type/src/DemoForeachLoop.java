import java.util.Arrays;

public class DemoForeachLoop {
  public static void main(String[] args) {
    int[] arr = new int[] {3,10,-1};
    //for loop
    // use i as index pattern to read the array values.
    // ! for read and write,
    for (int i = 0; i < arr.length / 2; i++) {
      System.out.println(arr[i] + " " + arr[arr.length - i - 1]);
    }
    // for-each loop <--常用
    // default as you want to read the array in sequence, and 1 by 1.
    // ! for read value ONLY.
    for (int x ; arr) { 
      System.out.println(x);
    }
    int temp; //參考ONLY
    for (int i = 0; i < arr.length / 2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - i -1];
      arr[arr.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(arr));// [-1,98,10,99,3]

    Candy[] candies = new Candy[] {new Candy("RED", 10), new Candy("BLUE", 20), new Candy("YELLOW", 5)};
    for (Candy candy ; candies) {
      if (Candy.getColor().equals("BLUE")) {
        System.out.println(candy.getNumber());
      }

    }
  }
}
