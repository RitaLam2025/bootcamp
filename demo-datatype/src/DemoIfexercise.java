public class DemoIfexercise {
  public static void main(String[] args) {
    int x = 15;

    if (x < 4) { // ! {一定要括住 1 個IF，跟住 else if 開另一個，燈泡提醒括住邊度, else 開另一個，望實括號！！！ 
      System.out.println("hello");
    }

    // if + else 
    if (x < 10) { // if x< 10, run goodbye, otherwise = else -> welcome
      System.out.println("goodbye");
    } else {
      System.out.println("welcome");
    }

    //！Rules： 
    // step 1: try "if" condition, if its true, execute action, then exit
    // step 2: if step 1 result is false, then "else if" situation, if its true, execute action, then exit.
    // step 3: if step result is false, then goes to "else", execute the action.


    // if + else if + else 
    int y = 40;

    if (y < 90) {
      System.out.println("y is smaller than 90.");
    } else if (y >= 90 && y < 100) {
      System.out.println("y is 90 < y is 99");
    } else {
      System.out.println("y >= 100");
    }

    // double w
    // if w < 100, print "ABC"
    // w between 103 and 110, print "DEF"
    // for other value, print "XYZ"
    int w = 40;
    if (w < 100) {
      System.out.println("ABC");
    } else if (w >= 103 && w <= 110) {
      System.out.println("DEF");
    } else { // else = 以上什麼都不是，行下面，all other values, no need fill in anything
      System.out.println("XYZ");
    }

    // AND &&
    // OR ||
    int a = 1;
    int b = 20;
    if (a > 3 || b < 15) {
      System.out.println("a > 3 OR b < 15.");
    } else {
      System.out.println("Error."); // print
    }

    int q = 4;
    int u = 80;
    if (q > 2) { // if q > 2, then u + 2 assign to LHS (u), if 成立，就不會去下一行, if 不成立，就再落去再落去
      u = u + 2;
    } else if (q < 5) {
      u = u + 10;
    } 
    System.out.println(u); // 82

    q = 10; // declare and initiate 
    u = 100;
    if ( q > 5 && u < 99) { // comparison
      System.out.println("hello");
    } else if (q == 10) {
      System.out.println("bye");
    } else {
      System.out.println("bootcamp"); // bootcamp 
    }

    // String
    String s1 = "hel";
    System.out.println(s1.length()); //3

    if (s1.length() > 3) {
      System.out.println("Java");
    } else {
      System.out.println("Python");
    }

    // equals() + if
    String s2 = "Javascript";
    int score = 0;
    if (s2.equals("Java")) {
      score += 1;
    } else {
      score +=2;
    }
    System.out.println(score); //2 

    // CharAt
    // Check if the first character of string is 'c' or the last character is 'd'.
    // if yes, print "yes", if no, print "no"

    String s3 = "string";
    if (s3.charAt(0) == 'c' || s3.charAt(s3.length() - 1) == 'd') {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    String s4 = "SouthKorea";
    if (s4.charAt(1) != 'o' && s4.charAt(s4.length() -1) == 'a') {
      System.out.println("wonderful");
    } else {
      System.out.println("amazing");
    }

    String s5 = "Italy";
    if (s5.charAt(0) == 'I' || s5.charAt(s5.length() -1) !='x') {
      System.out.println("bravo");
    } else {
      System.out.println("bella");
    }

    // switch
    char grade = 'B';
    if (grade == 'A') {
      System.out.println("Grade is A");
    } else if (grade == 'B') {
      System.out.println("Grade is B");
    } else if (grade == 'C') {
      System.out.println("Grade is C");
    } else {
      System.out.println("Fail");
    }

    String s6 = "Bali";
    if(s6.charAt(2) == 'l' && s6.charAt(s6.length() -1) != 'a') {
      System.out.println("Namaste");
    } else {
      System.out.println("goodbye");
    }

    //alternative
    // ! 1, You should use "break" for all cases in switch statement
    // ! 2, switch CANNOT check the range of the value
    switch (grade) {
      case 'A':
      System.out.println("Grade is A");
      break;
      case 'B':
      System.out.println("Grade is B");
      break;
      case 'C': 
      System.out.println("Grade is C");
      break;
      default:
      System.out.println("Fail");
    }

    score = 85;
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80 && score < 90) {
      grade = 'B';
    } else if (score >= 70 && score < 80) {
      grade = 'C';
    } else {
      grade = 'F';
    }
    // you cant use switch to handle above scenario to calculate the range of value.
















  }
}
