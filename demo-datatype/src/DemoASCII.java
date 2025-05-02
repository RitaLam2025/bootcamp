public class DemoASCII {
  public static void main(String[] args) {
    // convert char to int
    char c = 'a'; // 97 in ascii
    int x = c; // safe, small range put in large range is ok
    System.out.println(x); 

    int y = 65;
    char c2 = (char) y; // char can put around 6萬, java treats as during the compile time, variable y is int range.
    // convert from int to char is unsafe, char c2 = y
    // but write as above can convert, as 強行做
    System.out.println(c2); //A 

    System.out.println((char) 48); // 0 , from the table, 
    System.out.println((char) 65610); // J , from the table, 
    //  ! char 0-65535, 65610 > 65535, so run more circle
    

    // overflow , 強行做
    int x1 = 128;
    byte b1 = (byte) x1;
    System.out.println(b1); // -128

    // byte --> short --> int --> long --> float --> double // the latter one is larger range than the previous one
    // char --> int
    float f1 = 10L;
    System.out.println(f1); // 10.0
    double d1 = 100.25f;
    System.out.println(d1); // 100.25

    long l2 = (long) 10.9f; // 強行做
    System.out.println(l2); // 10

    int x8 = 33000;
    short s3 = (short)


  }
}
