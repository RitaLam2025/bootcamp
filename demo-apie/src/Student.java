public class Student { // !! Outer Class
  private Long id;

  public Student(Long id) {
    this.id = id;
  };
  
  // ! not allowed
  // public String getName() {
  // ...return name;
  // }
  }

  public void revision() {

    class Watch {
      private String value;
      // constructor
      // getter, setter,etc 
    }
  new Watch(); // able to create Watch Object within revision() method
}

  public void write() {
    // new watch();
  }
  
  public class Book { //! Inner Class 
    private String name;

    public Long getOWnerId() {
      return id;
    }
  }


  public static void main(String[] args) {
    Student s1 = new Student(1L);
    Book b1 = s1.new Book("ABC")

    System.out.println(b1.getOWnerId()); //1

    Book b1 = s1.new Book();
  }
}
