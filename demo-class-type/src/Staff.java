public class Staff { // describe why it s the same staff for staff s1, s2
  private long id;

  public Staff(long id) {
    this.id = id;
  }

  public long getId() {
    return this.id;
  }

  //equals() -> String, integer, Double 

  

  public boolean equals(Staff staff) {
    if (this.id == staff.getId()) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Staff s1 = new Staff(1L);
   

    // asking if the staff id = 1
      if (s1.getId() == 1L) {

      }

      System.out.println(s1.equals(new Staff(1L))); 
      // suppose true, but false now (if we do not rewrite equals () method)
      // ! by default, Java implicitly say that equals () checking object's address

      //after rewriting the equals method, new staff(1) equals new Staff(1)

      }
      String str = "hello";
      if (str.equals("hello")) {

      }
  }
}
