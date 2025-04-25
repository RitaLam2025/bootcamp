public class DemoIf {
    public static void main(String[] args) {
        int x = 3;
        if (x < 4) { // true/ as define x = 3
            System.out.println("hello");

        }
        if (x < 10) { // true , as define x = 3
            System.out.println("goodbye");
        } else { // as x = 3, if type else, then no welcome , if need to have welcome, change to
                 // larger than 3
            System.out.println("welcome");
        }

        // ! Rules:
        // Step 1: try "if" condition, if it is true, execute the action, and then EXIT
        // Step 2: if the step 1 resut is false, then "else if" condition, if it is
        // true, execute the action, and the EXIT.
        // Step 3: if step result is false, then goes to "else", execute the action
        // if + else if + else
        int y = 100;

        if (y < 90) {
            System.out.println("y is smaller than 90.");
        } else if (y >= 90 && y < 100) {
            System.out.println("y is 90 < y 99");
        } else { // y >= 100
            System.out.println("y >= 100");
        }
        // double w
        // if w < 100, print "ABC"
        // w between 103 and 110, print "DEF"
        // for other values, print "XYZ"
        int w = 40;
        if (w < 100) {
            System.out.println("ABC");
        } else if (w >= 103 && w <= 110) {
            System.out.println("DEF");
        } else {
            System.out.println("XYZ");

        }
        // AND &&
        // OR II
        int a = 2;
        int b = 16;
        if (a > 3 || b < 15) {
            System.out.println("a > 3 OR b < 15.");
        } else {
            System.out.println("Error.");
        }

        int q = 4;
        int u = 80;
        if (q > 2) {
            u = u + 2; // execute // only execute once
        } else if (q < 5) {
            u = u + 10; // not execute
        } else {
            System.out.println(u); // 82
        }

        q = 10;
        u = 100;

        if (q > 5 && u < 99) { // 1st condition , then print hello
            System.out.println("hello");
        } else if (q <= 5) { // 2nd condition, then print bye
            System.out.println("bye");
        } else { // q >5 && u >=99
            System.out.println("bootcamp");
        }
        // String
        String s1 = "hello";
        System.out.println(s1.length()); // 5
        if (s1.length() > 3) {
            System.out.println("Java");

        } else {
            System.out.println("Python");
        } // if print python, delete words in s1

        // equals() + if
        String s2 = "Javascript";
        int score = 0;
        if (s2.equals("Java")) {
            score += 1;
        }else {
            score += 2;
        }
        System.out.println(score); //2

        //CharAt
        //Check if the first character of string is 'c'or the last character is 'd', if yes, print "yes", if no, print "no".

        String s3 = "hello world";
        if (s3.charAt(0) == 'h' || s3.charAt(s3.length() -1) == 'd') {
            System.out.println("yes");
        } else {
            System.out.println("no");

            //switch 
            char grade = 'B';
            if (grade == 'A') {
                System.out.println("Grade is A");
            } else if (grade == 'B') {
                System.out.println("Grade is B"); //print
            } else if (grade == 'C') {
                System.out.println("Grade is C");
            } else {
                System.out.println("Fail");
            }

            //Alternative 
            //! 1, You should use "break" for all cases in switch statement, every scenario will use if, else if
            //! must have break as prevent landfill 
            //! 2, switch CANNOT check 

            switch (grade) {
                case 'A':
                System.out.println("Grade is A");
                break;
                case 'B':
                System.out.println("Grade is B");
                break; 
                case 'C':
                // need to write, no always use break 


                score = 85;
                if (score >= 90) {
                    grade = 'A';
                } else if (score >= 80 && score < 90) {
                    grade = 'B';
                } else if (score >= 70 && score )
                need to write 

            }

        








            
        }

    }




    


