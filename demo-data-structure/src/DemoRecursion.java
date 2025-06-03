public class DemoRecursion {
  public static void main(String[] args) {
    // n = 10
    // 1 + 2 + 3 + 4 + 5 .... + n
    int sum = 0;
    int n = 5;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum); // 15

    // recursion
    System.out.println(sum(5));

    // 2. even numbers
    System.out.println(sumEvenNumbers(11));
  }
  
}
