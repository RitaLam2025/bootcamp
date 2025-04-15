public class DemoDataTypeExercise {
    public static void main(String [] args) {
        System.out.println("Hello,World!");
        System.out.println("Rita Lam is great!");

        // Data Type: 8 Primitives
        // 1. (Store Integer) byte, short, int, long
        // 2. (Store number with decimal place) float, double
        // 3. (Store Single character) char
        // 4. (Store true or false) boolean 

        // Variable 變量
        // ! 1. int 
        // Integer (from +ve to -ve)

        // x and y are variables
        // "=" --> assignment 
        // from right assign to left
        int x = 3;
        // put 7 into y 
        int y = 7;

        System.out.println("x"); // x
        System.out.println(x); // 3
        System.out.println(y); // 7

        // Re-assign value 10 into variable x
        x = 10;
        System.out.println(x); // 10

        // Re-assign y to 100
        y = 100;
        // shortcut: sysout --> System.out.println();
        System.out.println(y); // 100

        int age = 65;
        int salary = 20000;

        // Variable name convention
        // 1, Must be started with a-z
        // 2. Camel Case (1st noun starts with small letter, 2nd noun capital)
        int w1 = 2;

        //
        int tutorFirstName = 3;
        System.out.println(tutorFirstName); //3

        // Declaration for variable type (聲明變量類型)
        int a;
        // Same variable name can be declared once only.
        // Assignment
        a = 4;
        System.out.println(a); //4

        // declaration and assignment
        int w = 10;

        // ! double
        double d1 = 4.4;
        double d2 = 9.999;
        System.out.println(d2); //9.999

        double d3;
        d3 = 10.4;
        System.out.println(d3); //10.4

        // ! int + , -, *, /
        int x2 = 6 + 1;
        System.out.println(x2); //7
        int x3 = 9;

        // ! put x3 value into variable x2
        x2 = x3;
        System.out.println(x2); //9, as right assign to left
        System.out.println(x3); //9

        int x4 =10;
        x2 = 7 + x4;
        System.out.println(x2); //17

        // ! add 8 to itself
        x2 = x2 + 8;
        System.out.println(x2); //25

        // ! 1, (Store Integer) byte, short, int, long
        byte b1 = 3;
        short s1 = 3;
        int i1 = 3;
        long l1 = 3;

        //byte (負128 至 正127) (8 bits) // can't 大過 127
        // short (負32xxx 至 正32xxx) (16 bits) 
        // int (負21憶.x 至 正21憶.x)  // can't 大過 21 憶
        // long (2^63) 
        b1 = -128;
        // b1 = 128;
        s1 = 32767;
        // s1 = 32768;

        i1 = 2_147_483_647;
        // _ = 千位既COMMA

        // int + int --> int (overflow)
        i1 = i1 +1;
        System.out.println(i1); // -2147483648 (overflow)

        //1, prepare a long value 22憶 （right hand side)
        //2, assign a value into long variable (left hand side)
        // l1 = 2_200_000_000; //! system error (you cant prepare an int value 22憶)
        l1 = l1 + 3L;
        System.out.println(l1); //6
        l1 = l1 + 2_200_000_000L; //2200000006
        System.out.println(l1);

        // long + int --> long + long --> long
        long l2 = 2_200_000_000L + 5;
        System.out.println(l1);

        //
        int i8 = 9;
        // byte b9 = i8; // wt is type of i8? as i8 is integer,  it can be 21憶。as int variable -> unsafe
        byte b10 = 3; //direct value can put in byte , unsafe to put int variable
        // short s11 = i8; // unsafe
        // ! right hand side (Can't put 大過左邊short, int, long variable，eg  )
        // ! the range of int value should solve majority of problem in system.
        // so we wont long as default type of variable to store integer.

        // ! boolean (either true or false)
        boolean b9 = true;
        b9 = false;

        int result = 10;
        // "result % 2 ==1" --> true
        // 除（%）得儘 ＝ 1， 

        // boolean 
        boolean isResultOddNumber = result % 2 == 1; 
        System.out.println(isResultOddNumber);

        // char
        // single quote
        // assign char value "a" into char variable 
        char c1 = 'a';
        System.out.println(c1); // a
        c1 = '$';
        c1 = '+';
        c1 = 'a';
        char c2 = 'A';
        System.out.println(c1 == c2); //false, java is case sensitive

        // char lastName = '陳'； (invalid - unable to print chinese)
        // System.out.println(lastName);
        //we cant assign a bigger range of variable to smaller range of variable (by default)
        // Force assignment 
        byte b40 = (byte) 129L;
        System.out.println(b40); //-127 (overflow)

        //float (store decimal number)
        // 3.14159 is double value
        // so unsafe (assign double value to float variable, as smaller)
        float f1 = 3.14159f;

        //Problem --solve later in end apr
        f1 = 0.3f + 0.4f;
        System.out.println(f1); //0.70000005


    }
    
}
