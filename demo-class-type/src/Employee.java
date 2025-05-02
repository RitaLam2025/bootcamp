public class Employee { // an employee has name, age, email.
  // ! Attributes, 
  private String name;
  private int age;
  private String email;
  // name, age, email as a bundle to put in "employee"
  // above class is a 模具 , so employee is name, email, age --> attributes

  // Object Method (Instance method)
  public void setName (String name) {
    this.name = name; // give name to it , put abc into LHS
  }

  public String getName() {
     return this.name; // get the name from it, 
  }

  public void setAge (int age) { // as ,set 野俾矩 , put void
    this.age = age;  
  }

  public int getAge() { // set int to it, put int, 問矩拎返
    return this.age; // return 
  }

  public void setEmail (String Email) {
    this.email = email;
  }

  
  // call 返自己個名

    //Runtime
    public static void main(String[] args) {
      // Problem
        String employee1Name = "John";
        int employee1Age = 26;
        String employee1Email = "john@gmail.com";

        String employee2Name = "Steven";
        int employee2Age = 30;
        String employee2Email = "steven@gmail.com";
        
        // Solution - Class and object
        Employee e1 = new Employee(); // first see RHS, 
        e1.setName("John"); // put John into it,
        System.out.println(e1.getName()); // "John"
        // e1 = TKO address
        // new employee = build a new building

        Employee e2 = new Employee(); // first see RHS, 
        e2.setName("Sally"); // put John into it,
        System.out.println(e2.getName()); // "John"

        e1 = e2;
        System.out.println(e1); // as put 


        // "." means goes to address (e1) , this --> 進入第1人
        // first see RHS - define employee as name, email, age
        // 

        Employee e3 = new Employee();
        e3.setAge(20);
        System.out.println(e3.getAge());



  }
}
