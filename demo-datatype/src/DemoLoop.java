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
    for (int i = 0; i < 9; i++) { // i= 0,1,2,3,4,5,6,7,8
      y = y * 2;
      System.out.println(y);
    }

    // for + if
    // print even number between 0 -10
    // even number --> x % 2 == 0
    for (int i = 0; i < 11; i++) { // i = 0,1,2,3,4,5,6,7,8,9,10 數多小次
      if (i % 2 == 0) {// even number
        System.out.println(i);

      }
    }

    // for + if
    // print the char index of 'm', if found, print index, if not found, print -1
    String s2 = "bootcamp";
    int index = -1;
    for (int i = 0; i < s2.length(); i++) { // i = 0,1,2,3,4,5,6,7
      if (s2.charAt(i) == 'm') { // 6, as m is 6
        index = i;
      }
    }
    System.out.println(index);
    System.out.println(s2.length());
    System.out.println(s2.equals("boot"));
    System.out.println(s2.charAt(2));
    System.out.println(s2.charAt(s2.length() - 1));

    // function 4: indexOf(), lastIndexOf()
    String s4 = "Sally";
    System.out.println(s4.indexOf('a'));

    // function 5: contains(),
    System.out.println(s4.contains("ll")); // true

    if (s4.contains("ll")) {
      System.out.println("The name contains \"ll\"");

    }

    // function 6; startsWith (), endsWith()
    System.out.println(s4.startsWith("Sa"));

    if (s4.startsWith("Sa")) {
      System.out.println("The name startsWith \"Sa\"");

    }

    // function 7
    String s5 = ""; // string can leave it as empty// empty

    // function 8 : concat // do the combination of diff words
    String s6 = "abc";
    System.out.println(s6.concat("def")); // abcdef

    String s7 = "hello";
    System.out.println(s7.replace('l', 'x')); // hexxo
    System.out.println(s7.replace("ll", "abc"));// heabco
    System.out.println(s7);// hello
    // after replace is also hello

    // function 10: substring()
    String s8 = "helloWorld";
    System.out.println(s8.substring(4, 7));
    // end index (minus 1)//

    // function 11 - toLowerCase (), toUpperCase(),
    String s9 = "Hello";
    System.out.println(s9.toUpperCase());
    System.out.println(s9.toLowerCase());

    // fuction 12: valueOf () -> conversion-> 數字同STRING互換
    int z = 3; // from int change to string
    String ss = String.valueOf(z);
    System.out.println(ss);

    double d1 = Double.valueOf("3.3");
    System.out.println(d1);// put RHS to d1**

    // April 24,2025- break
    // find the first character of 'a' in a given String, print the index of
    // character
    String str = "character";
    for (int i = 0; i < str.length(); i++) { // quote all the criteria
      if (str.charAt(i) == 'a') { // filter sth you want to have
        System.out.println(i); // 2
        break; // break the whole loop (Stop the loop, exit the loop)
      }

    }
    // find the first 3 character of 'a' in a given string
    ss = "abcdeabcdeabcdeabcdeabcde";
    int counter = 0;
    for (int i = 0; i < ss.length(); i++) { // no need think, just write the length()
      if (ss.charAt(i) == 'a') { // 0,1,2 (count 3 times) // filtering those no need
        if (counter >= 3) {
          break;
        }
        System.out.println(i);
        counter++; // echo to counter >= 3
      }
    }

    // ! continue + Loop
    // Print all index of character of 'a' in a given string
    String ss2 = "abcabcabc";
    for (int i = 0; i < ss2.length(); i++) {// never change, always like that
      if (ss2.charAt(i) == 'a') { // loop once, if equal a, then print
        System.out.println(i);

      }

    }

    for (int i = 0; i < ss2.length(); i++) { // for loop - repeat to count, calculate the length
      if (ss2.charAt(i) != 'a') {
        continue; // if != ( not equal) to a, the below can skip, skip the rest of code line, n
                  // goes to next iterination , go up to the upper

        // every wed n is holiday, i dont go running
      }
      System.out.println(i);
    }

    for (int i = 0; i < 3; ++) {

      for ()





    }

  }
}
