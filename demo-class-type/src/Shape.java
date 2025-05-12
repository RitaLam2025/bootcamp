public class Shape {
  private static int counter = 0; 
  private static final double PI = 3.14159; // final = finalised , constant常數 ，不變，所以不能再ASSIGN
  // "static final"--> constant - eg, PI (remember example) 
  private final String name = "John";
  private String color; // attributes (ususally we have setter, because it is not final)

  // explain the above 4 sentences in own words

  public Shape() {
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    System.out.println(Shape.PI); // 3.14159
    // ! because shape of PI is a "final variable" , so cant be modified
    //Shape.PI +=1; 
    Shape.counter++;
    System.out.println(Shape.counter); //1

    new Shape().counter++; // Not recommended
    Shape.counter++; // normal usage
    System.out.println(Shape.counter); //3

    // print John 
    Shape s1 = new Shape();
    System.out.println(s1.getName());//john

    System.out.println(new Shape().getName()); //john , just want to ask the name from new shape, 
  
    
    
  }

  
}
