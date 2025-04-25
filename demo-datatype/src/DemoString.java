public class DemoString {
    public static void main(String[] args) {
        //String is NOT primitive, which consists of a set of char values
        String s = "John";
        String s2 = "Dear Sir,";

        // !! 8 primitives --> store values ONLY (byte, char, boolean)
        // !! String --> store value + functions
        String s3 = "Steven";
        s3 = "Vincent";
        System.out.println(s3); // Vincent

        //!! Function 1: equals ()
        //String can't use "==" to check it is equal
        System.out.println(s3.equals("Vincent")); //true
        System.out.println(s3.equals("vincent")); // false , as case sensitive
        // this is ask equal or not, as need to add sth in

        //!1 Function 2; length ()
        System.out.println(s3.length()); //7
        // this is the open question about length, so leave it blank.

        //!! Function 3; charAt()
        // !! index always starts with 0
        // !! index range 0-6, length = 7
        System.out.println(s3.charAt(2)); //"n" , char at position 3
        // as n in vincent is 2, as index start from 0
        System.out.println(s3.charAt(7)); // out of range
        System.out.println(s3.charAt(-1));// !! out of range, no negative digit

        //question
        // if always need to print the last character of s3
        s3 = "Steven";
        // length (), charAt ()
        System.out.println(s3.charAt(s3.length() -1); //n
        
        //find the middle character of name
        String name = "Joey"; //o
        //Joey -->e (靠右)
        //Vincent -->c
        System.out.println(name.charAt(name.length() /2));




    

    }
    
}
