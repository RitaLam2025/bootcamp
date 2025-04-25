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
    System.out.println(s.equals("true"));
    System.out.println(s.length() -1);
    System.out.println(s.charAt(2));
    System.out.println(s.charAt(s.length() /2));

    String s4 = "Labubu";
    System.out.println(s4.equals("LA"));
    System.out.println(s4.length());
    System.out.println(s4.charAt(4));
    System.out.println(s4.length());
    System.out.println(s4.charAt(s4.length() /2));
    // middle character of name 
    System.out.println(s4.charAt(s4.length() -1));
    // last character of name
    System.out.println(s4.charAt(s4.length() -1));
    System.out.println(s4.charAt(s4.length() /2));
    System.out.println(s4.length());
    System.out.println(s4.equals("LAAA"));
    System.out.println(s4.charAt(s4.length() -1));

    //+, -, *, /, %
    int x = 3;
    x = 6 + 9;
    int y = 5 + x -10;
    System.out.println(y);

    // 9 * 2 first
    int a = y - 9 * 2;
    System.out.println(a);

    int b = (y - 9) * 2;
    System.out.println(b);

    // divide by zero
    // int r = 10 /0; --> divide by 0 --> undefined

    int r2 = 0/ 10;
    System.out.println(r2);
    //m0 divide any figure is 0 

    int r3 = 10 / 3;
    System.out.println(r3);

    System.out.println(5/2);
    // !! as java - int /int --> int

    System.out.println(5.0/2);
    // !! java - double / int --> double

    System.out.println(5.0/2.0);
    //! java - double/double --> double

    System.out.println(6.0/2);
    System.out.println(2/2);
    System.out.println(5.0/6.0);

    int score1 = 71;
    int score2 = 82;
    double averageScore = (score1 + score2) /2.0;
    System.out.println(averageScore);

    // write double/int first
    // ! (int + int) / int --> int
    // ! (int + int) / double --> double
    
    int r8 = 10 % 3;
    // ! = remainder of 10 / 3
    System.out.println(r8);// 1 - remainder

    // Boolean //
    int JohnAge = 64;
    boolean isElderly = JohnAge >= 65;// formulaa, definition
    // ! boolean write is something, eg, isMale, isFemale

    // char
    // single quote 
    // assign char value 'a' into char variable, 

    char c1 = 'a';
    System.out.println(c1); //a
    c1 = '$';
    c1 = '+';
    char c2 = 'A';
    System.out.println(c1 == c2);

    // +1 and -1
    int t = 0;
    t++; //1
    ++t; // 2
    t +=1; //3
    t = t + 1;
    // "= t +" --> "+="
    System.out.println(t);

    int w = 0;
    w--; // -1
    --w; // -2
    w = w - 1; // -3
    w -= 1; //-4
    System.out.println(w); // -4

    // +/- non 1 value
    int o = 3;
    o -= 4; // o = o-4
    o += 4; // o = o+4
    System.out.println(o);// 3
    //  3 -4 = -1 ; -1 + 4= 3

    int q = 3;
    q = q * 3; // 9 
    q *= 3; // q = q*3 // 27
    System.out.println(q); //27

    int v = 27;
    v /=3; // v = v/3 ; 9
    v = v / 3; // 9/3 = 3
    System.out.println(v); // 3

    // comparison
    // >, <, >=, <=, ==, !=
    // != --> unequal

    int score = 91;
    boolean isGradeA = score >= 90;
    System.out.println(isGradeA);

    int age = 56;
    boolean isOld = age >= 56;
    System.out.println(isOld);

    int salary = 18000;
    boolean isRich = salary >= 200000; 
    System.out.println(isRich);

    int pimples = 89;
    boolean isBeautiful = pimples <= 2;
    System.out.println(isBeautiful);

    int bonus = 89000;
    boolean isSuperRich = bonus >= 20000000;
    System.out.println(isSuperRich);

    int Childage = 18;
    boolean isSuperYoung = Childage <= 18;
    System.out.println(isSuperYoung);

    int Adultage = 89;
    boolean isSuperOldseafood = Adultage >= 70;
    System.out.println(isSuperOldseafood);

    int Teenage = 18;
    boolean isQuiteyoung = Teenage >= 19;
    System.out.println(isQuiteyoung);
    // boolean always true false

    char gender = 'M';
    boolean isFemale = gender !='M'; // !! != unequal
    System.out.println(isFemale);

    char Teenagegender = 'F';
    boolean isWoman = Teenagegender == 'F';
    System.out.println(isWoman);

    char teen = 'F';
    boolean isMan = teen != 'M';
    System.out.println(isMan);

   









  }
  
}
