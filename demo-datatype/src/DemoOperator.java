public class DemoOperator {
   public static void main(String[] args) {
    // +,-,*,/,%
    int x = 3;
    x = 6 + 9;
    int y = 5 + x - 10;
    System.out.println(y);

    // 9 * 2 first 
    int a = y - 9 * 2;
    System.out.println(a);

    int b = (y - 9) * 2;
    System.out.println(b);

    //divide by zero 
    // int r = 10 / 0;  // system error ( cant 除零，undefinied)

    int r2 = 0 / 10; 
    System.out.println(r2); // 0 (零除 10/all number = 0 )

    int r3 = 10 / 3;
    System.out.println(r3);

    System.out.println(5/2); //2
    // ! as java: int / int --> int 

    System.out.println(5.0/2); //2.5
    // ! as java: double/ int --> double 

    System.out.println(5.0/2.0); //2.5
    // ! java: double/double --> double

    int score1 = 71;
    int score2 = 82;
    double averageScore = (score1 + score2) / 2.0;
    System.out.println(averageScore); // 76.5

    // write double/int first 
    //! (int + int) / int ---> int
    //! (int + int) / double --> double

    // End Apr - Big problem
    double d5 = 0.1 + 0.2;
    System.out.println(d5); //0.3000000000004

    int r8 = 10 % 3; 
    //! = remainder 餘數 of 10 / 3 
    System.out.println(r8); //1 餘數 

    //Boolean//
    int johnAge = 64;
    boolean isElderly = johnAge >= 65; //formula / definition
    System.out.println(isElderly); // false 
    // ! boolean 寫is something , eg isMale, isFemale, isGirl, isBoy, etc.....

    // char 
    // single quote
    // assign char value 'a' into char variable , 由零到 6万多 ，唯一不是NEGATIVE 數字開始
    // ! we cant assign a bigger range of variable to smaller range of variable (by default)//

    // byte b40 = 128L; // as long bigger than byte, unvalid
    
    //!!but we can FORCE assignment <--dont understand....
    byte b40 = (byte) 129L;
    System.out.println(b40); //-127 (overflow)

    // ! 1st - RHS --> write as legit? add L 



    char c1 = 'a';
    System.out.println(c1); // a
    c1 = '$';
    c1 = '+';
    char c2 = 'A';
    System.out.println(c1 == c2); // false, because Java is case sensitive

    //float (store decimal number)
    //float f1 = 3.14159; 
    // 3.14159 is double value
    // 1st step can prepare float , 2nd step unsafe (as assign double value to float variable
    float f1 = 3.14159f;
    long l15 = 3L; //as l looks like 1, so write big capital L)

    //problem --> 
    f1 = 0.3f + 0.4f;
    System.out.println(f1);



    
    // 3L = long value
    // 3 = int 

    // +1 and -1 
    int t = 0;
    t++;
    ++t;
    t +=1;
    t = t + 1;
    // "= t +" --> "+="
    System.out.println(t); //4
    //t++ = 1

    int w = 0;
    w--;
    --w;
    w = w - 1;
    w -= 1;
    System.out.println(w); //-4
    //w-- =-1

    // +/- non 1 value
    int o = 3;
    o -= 4; // o = o-4
    o += 4; //o = o+4
    System.out.println(o); //3
    //

    int q = 3;
    q = q * 3; // q = q*3
    q *= 3; // q = q*3
    System.out.println(q); //27
    // equal q = q * 3//
    // *3

    int v = 27;
    v /=3; // v = v/3 
    v = v / 3; 
    System.out.println(v); //3 (*27/3/3)

    //comparison
    // >, <, >=, <=, ==, != 
    //== --> left is equal to right
    //!= --> unequal 

    int score = 91;
    boolean isGradeA = score >= 90;
    System.out.println(isGradeA); //true

    char gender = 'M';
    boolean isFemale = gender !='M'; // != unequal M
    System.out.println(isFemale); //false
    // always looks at right hand side first

    }
    
}
