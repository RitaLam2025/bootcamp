import java.util.concurrent.RecursiveTask;

public class ExerciseApril19 {
  public static void main(String[] args) {
    String s = "John";
    String s2 = "Dear Sir,";

    //! 8 primitives -> store value onl7, byte, short, int, long, float, double, char, boolean
    // !! String --> store value +function
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3); 

    //Function 1: equals ()
    //String cant use "==" to check it is equal.
    System.out.println(s3.equals("Vincent"));

    //Function 2: length ()
    System.out.println(s3.length()); //7, as Vincent has 7 letters

    //Function 3: charAt()
    //!!index always starts with 0
    //! index range from 0-6, length = 7
    System.out.println(s3.charAt(2)); // "n", char at position 3
    // as v counts as index 0, (0,1,2....)

    //question 
    // if always need to print the last characterof s3
    s3 = "Steven";
    // length (), charAt ()
    System.out.println(s3.charAt(s3.length() -1)); //n

    //find the middle character of name
    String name = "Joey"; 
    System.out.println(name.charAt(2));

    System.out.println(name.charAt(name.length() /2));
    
    System.out.println(s2.equals("Rita"));
    System.out.println(s.equals("John"));
    System.out.println(s.length());
    System.out.println(s2.length());
    System.out.println(s2.equals("yuzi"));
    System.out.println(s2.equals("Lily"));
    System.out.println(s2.length());
    System.out.println(s.charAt(3));
    System.out.println(s.charAt(1));
    System.out.println(s.charAt(s.length()-1));
    System.out.println(s.length() -2);
    System.out.println(s.equals("Greg"));
    System.out.println(s.length() -3);
    System.out.println(s.charAt(s.length() /2));
    System.out.println(s.length());
    System.out.println(s.charAt(3));
    System.out.println(s.charAt(s.length() -1));
    System.out.println(s.charAt(s.length() /2));




  }
  
}
