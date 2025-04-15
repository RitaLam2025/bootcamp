

public class DemoDatatype {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //variable 
        //integer (+ve - -ve)
        int x = 3; 
        int y = 7;
    
        System.out.println("x");
        System.out.println(x);
        System.out.println(y);
        System.out.println();
        //sysout --> short cut for above
        System.out.println(y);
        System.out.println();
        int a = 4;
        //declaration of variable type, int a 
        int a;
        // +, -, *, /
        int x3 = 9;
        x2 = x3
        //! put x3 value into variable x2
        System.out.println(x2); //9
        int x4 = 10; 
        x2 = 7 + x4;

        // ! add 3 to itself 
        x2 = x2 + 8; //25
        
        // data type Primitives ( the most raw data type) 
        // 1. (Store integer) byte, short, inti, long, 
        // 2. (Store number with decimal place) float, double,
        // 3. (store single character) char
        // 4. (store true or false) boolean

        a = 100000000; 

        //re-assign value 10 into varible x
        //variable name convention 
        //! 1. must start with a-z 
        //! 2. Camel Case --> int 1st noun starts with small letter, 2nd noun starts with capital, 3rd noun...)
        //! 3. same variable name can be declared once only
        System.out.println(a); //4

        // ! double 
        double d1 = 4.4;
        double d2 = 9.9999;
        System.out.println(d2);
        double d3 = 5.6777777;
        System.out.println(d3);

        //byte, short, int, long (store integer)
        byte b1 = 3;
        short s1 = 3;
        int i1 = 3;
        long l1 = 3;

        //byte (-128 至 正正127) (8 bits) // cant 大過 127
        // short (-32xxx - 32xxx) (16 bits) 
        // int (-21憶.x -21憶.x)  // can't 大過 21 憶
        // long (2^63) // 
        b1 = -128;
        s1 = 32767;
        i1 = 2_147_483_647;
        i1 = i1 + 1;
        System.out.println(i1); // overflow 
        // _ = , ( in value)

        l1 = 2_200_000_000; // no 22憶INT -> invalid 
        //1, prepare from right to left --> prepare an int value 22 憶 （right hand side)
        //2. assign a value  into long variable (left hand side)
        l1 = 2_200_000_000L;
        l1 = l1 +3L;
        System.out.println(l1);
        // int + int --> int (overflow)
        //long + int --> long
        long l2 = 2_200_000_000L + 5; 
        System.out.println(l2);

        int i8 = 9;
        byte b9  = i8; // wt is type of i8? as i8 is integer,  it can be 21憶。as int variable -> unsafe
        byte b10 = 3; //direct value can put in byte , unsafe to put int variable
        
        // ! right hand side (Can't put 大過左邊short, int, long variable，eg  )
        //! range of int value should solve majority of problem in system.
        //! so we wont use long as default type of variable to store integer.

        // boolean (either true or false)
        boolean b9 = true;
        b9 = false;

        int result = 5;
        // "result % 2 ==1" --> true
        boolean isResultOddNumber = result % 2 ==1; // "=="--> checking if equals to 
        System.out.println(isResultOddNumber); // false

        






    


        //"=" --> assignment
        //from right to left
    }
}
