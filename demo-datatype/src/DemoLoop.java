public class DemoLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;
    // 2^3


    // 2^10
    // ! For Loop
    // for (initialization; continue condition; modifier)
    // Step 1: i = 0
    // Step 2: check if i < 3
    // Step 3: if yes, print hello 
    // Step 4: i + 1
    // Step 5: check if i < 3
    // Step 6: if yes, print hello
    // Step 7: i + 1
    // Step 8: check if i <3
    // Step 9: yes, print hello
    // Step 10: i + 1
    // Step 11: check i < 3
    // Step 12: No -> exit Loop
    for (int i = 0; i < 3; i++) { // i need to be smaller than 3, sin keep going
    // ! recite above formula, start i = 0, i < need to copy how many timea */
      System.out.println("hello");

    }

    // 2^10
    int y = 2;
    for (int i = 0; i < 9; i++) { //i= 0,1,2,3,4,5,6,7,8
      y = y * 2; 
      System.out.println(y);
    }

    // for + if
    // print even number between 0 -10
    // even number --> x % 2 == 0
    for (int i = 0; i <11; i++) { //i = 0,1,2,3,4,5,6,7,8,9,10 數多小次
      if (i % 2 == 0) {// even number
        System.out.println(i);

      }
    }

    // for + if
    // print the char index of 'm', if found, print index, if not found, print -1
    String s2 = "bootcamp";
    int index = -1;
    for (int i = 0; i <s2.length(); i++) { //i = 0,1,2,3,4,5,6,7
      if (s2.charAt(i) == 'm') { // 6, as m is 6
        index = i;
      }
    }
    System.out.println(index);








  }
}
