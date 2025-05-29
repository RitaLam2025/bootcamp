// !! Cat is a kind of "Animal", car is a kind of "machine" - for thinking 
//!! After "Extends", cat is a child class, while animal is a parent class
// ! 1, inherit all attributes from Parent Class
// ! 2, cannot inherit constructor from Parent Class, but we can call the Parent' constructor by "super"
// ! 3, inherit instance method from Parent Class

public class Cat extends Animal{
  // private int age;//  cat can extend its name;
  private String name; 
}
 
  public Cat(String name, int age){// cat also has age, so write in that way
    super(age); // as extends - call animal gei constructor, 
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
    public int getAge() {
      return super.getAge() + 10; //自己既，可以任加 數值； 
    }
    public int getAge2() {
      return super.getAge(); //寫死左，係阿媽GETAGE,SUPER 係仔 搵阿媽 （NEW keyword
    }
    public static void main(String[] args) {
      Cat cat = new Cat("John",13);
      System.out.println(cat.getAge()); 
      System.out.println(cat.getAge2()); 
      System.out.println(cat.getName()); 
  }

