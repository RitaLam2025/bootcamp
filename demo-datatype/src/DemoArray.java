import java.util.ArrayList;
import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // problem 
    int x = 2;
    int x2 = 8;
    int x3 = 1000;
    System.out.println(x);
    System.out.println(x2);
    System.out.println(x3);

    //Array
    // ! Store a set of same type of values
    //For example, a set of int values
    // 3--> three places to store int values
    int[] arr = new int[3];

    // ! write value into array
    // 0 represents the first place of the array 
    arr[0] = 2;
    arr[1] = 8;
    arr[2] = 1000;
    // arr[3] = 10; // error, array length 3, it s 0,1,2,  so u cant access the 4th places

    // ! read value from array
    System.out.println(arr[0]); //2
    System.out.println(arr[1]); //8
    System.out.println(arr[2]);// 1000

    //declare double array --> 4 values
    // 1.1, 9.2, -9.8, 77.9
    // print them out

    double[] arr1 = new double[4];
    arr1[0] = 1.1;
    arr1[1] = 9.2;
    arr1[2] = -9.8;
    arr1[3] = 77.9;

    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);
    System.out.println(arr1[3]);
    
    // arr2.length -> array length
    // for (int i = 0; i <  4; i++) {
    // missing here need to add inside

    String[] arr4 = new String[] {"abc", "def","bootcamp"};
    // for loop
    for (int i=0; i < arr4.length; i++) { // i < 3 -> 0,1,2
      System.out.println(arr4[1]);
    }
    // for loop + if (filtering)
    // Find the strings in the array, which length >4
    for (int i = 0; i < arr4. length; i++) {
      if (arr4[i].length() > 4) {
        System.out.println(arr4[i]);
      }
    }
    // for loop + if (AND OR)
    // Print the strings in the array, which length > 4 and starts with 'b'
    for (int i = 0; i < arr4. length; i++ ) {// structure
      if (arr4[i].length() > 4 && arr4[i].startsWith("b")) {
        System.out.println(arr[4]);
      }
    }

    //Print the srings in array, whihc length =3, or endsWith 'p'
    for (int i =0; i < arr4.length; i++) {
      if (arr4[i].length() == 3 || arr4[i].endsWith("p")) {
        System.out.println(arr[4]);
      }
    }
    // 
    int [] arr5 = new int [] {4, 7, -3, 1500, -100, 1000};
    // print the max value in the array.
    // for loop + if 
    // box is the variable, 
    int box = arr5[0]; // see all boxes of figuree
    for (int i=0; i < arr5.length; i++) {// type for loop, as need to see everything
      if (arr5[i] > box) { // for loop, 
        box = arr5[i];
      }
    }
    System.out.println(box);
    int min = arr5[0];
    for (int i=0; i < arr5.length; i++) {
      if (arr5[i] < min) {
        min = arr5[i]; // 放IF係FOR，因為要行一次 FOR LOOP，IF就係 FILTERING，然後要搵野，所以放一個盒，BOX，MIN，
      }
    }

    // swap
    int a = 6; // a= orange juice
    int b = 8; // b= cola
    int backup = a; // a already being back up, a is empty , can put other things
    a = b;
    b = backup;
    System.out.println(a); //8 
    System.out.println(b); //6
    
    int[] arr6 = new int[] {9, 7, 10, -3, 8};
    // move the max value to the tail of array.
    // for + if 
    // keep comparing to the next figure, then keep moving to tail
    // just know below is ok, 深
    int box1 = arr6[0];
    for (int i = 0; i < arr.length - 1; i++) { // add "-1" , keep comparing, then compare with the last character
      if (arr6[i] > arr6[i + 1]) {
        backup = arr6[i];
        arr6[i] = arr6[i+1];
        arr6[i+1] = backup;
      }
    }
    System.out.println(Arrays.toString(arr6));//7，9，-3，8，10

    // bonus point - very complicated but can just listen,dont un is ok , 
    // Sorting
    // [7, 9, -3, 8, 10] // 5 figures will play 4 times;
    // [x, x, x, 9, 10]
    // ......
    // [-3, 7, 8, 9, 10]
    arr6 = new int[] {9, 7, 10, -3, 8};
   



   









  }

}

