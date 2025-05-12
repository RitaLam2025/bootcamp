public class DemoStaticMethod {
  public int age;

  public DemoStaticMethod(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
  // !! most (90%) of instance methods are presentations
// !! presentation (present the content of object)
  public boolean isElderly() {
    return this.age > 65;
  }

  public boolean isChild() {
    return this.age < 18; // definition 
  }
  // instance method -> rely on content inside to get the answer, use this. to call 

// ! static method
// 1, input (age) --> output (boolean)
  public static boolean isElderly2(int age) {
    return age > 65; 
  }

  //why it can be instance method? 
  public int sum(int x, int y) {
    return x + y
  }

  public static void main(String[] args) {
    DemoStaticMethod dsm = new DemoStaticMethod(10); // use dsm to check if he is elderly or not 
    System.out.println(dsm.getAge());
    System.out.println(dsm.isElderly()); //false
    System.out.println(dsm.isChild()); // true
    

    System.out.println(dsm.getAge() > 65); //false
    
    System.out.println(DemoStaticMethod.isElderly2(66));

    System.out.println(new DemoStaticMethod(19).sum(1, 2));

    
  }
}
