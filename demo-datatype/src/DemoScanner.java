import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input a number:");
    int input = scanner.nextInt();

    System.out.println("The input is " + input);

    String s = ""; // EVEN or ODD
    if (input % 2 == 0 ) {
      s = "EVEN";
    } else {
      s = "ODD";
    }
    System.out.println(s);
    // run the value as even or 

  }
}
