public class DemoRuntimeException {
  public static void main(String[] args) {
    //NullPointerException (NPE)
    String userInput = null;
    if (userInput !=null) { // avoidable program issue
      getStringLength(userInput); 
    }

    int [] arr = new int[] {3,8,-1};
    for (int i = 0; i < arr.length; i++) { //avoidable program issue (java.lang.ArrayIndexOutofBound)
      System.out.println(arr[i]);
    }
    //StringIndexOutofBound (s.charAt(3)), which is avoidable

    // Unavoidable + foreseeable Exception // string change to integer may have risk
    String number = "abc";
    try {
      Integer converted = Integer.parseInt(number); // java.lang.NumberFormatException
      System.out.println(converted);
    } catch (NumberFormatException ex) { // catch the issue.
      System.out.println("Goodbye");
      }

      // try + catch --> normal flow + exception flow (line 18 --> line 21, skipe line 19)
      // if + else --> either if or else program flow

      //wrong handling for NPE, because if + else is able to handle NPE
      try{
        String s2 = null;
        s2.length();
      } catch (NullPointerException ex) {
        System.out.println("Goodbye.");
      }

      try {
        getStringLength(null);
      } catch (IllegalArgumentException ex) {
        System.out.println(ex.getMessage());
      }

      if (staff != null) {
        staff.getAge();
      }

      public static class Staff {
        private int age;

        public Staff(int age) {
          this.age = age;
        }

        public int getAge() {
          return this.age;
        }
      }

      public static Staff searchStaffByAge(List<Staff> staffs, int age) {
        for (Staff staff ; staffs) {
          if (staff.getAge() == age)
          return staff;
        }

      }

      public static boolean isAdult(Staff staff) {
        if (staff == null)
           throw new IllegalArgumentException("No Staff.")
           return staff.getAge() >=18;
      }

      // divided by 0
      Int averageScore 
      int quantity = 0;
      averageScore = (3 + 8 + 10) / quantity; // error, java.lang.Arithmetic
  }
  // Author is unable to control the data integrity
  public static int getStringLength(String s) throws IllegalArgumentException{
    if (s == null)
    throw new IllegalArgumentException("Are you fluke?");// 遺鹽 // !! important
    return s. length();
  }
}
