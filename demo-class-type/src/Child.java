public class Child {
  // !! static-> common attribute, NOT belong to any objects
  // !! but all objects can access the static variable.
  private static int counter = 0; 

  // every child object has id, firstname, lastname, but no counter.
  // attribute (instance variable)
  // instance = object
  private long id;
  private String firstName;
  private String lastName; // define child only has 2 attributes , as world can have , if world can have a lot of Leo chan, so we need to write more than 2 attributes

// constructor // !! need to know how to wrtie
public Child(String firstName, String lastName) {
  counter++; // plus 2 for 
  this.id = counter; 
  this.firstName = firstName;
  this.lastName = lastName;
}

// getter // !! need to know how to write
public long getId() {
  return this.id;
}
//! encapsulation - freely 封裝多小LAYER, 
public String fullName() {
  return this.firstName + "" this.lastName;
}

public String getFirstName() {
  return this.firstName;
}

public String getLastName() {
  return this.lastName;
}



//! rewrite the definition of child in your world, refer only one Leo chan in the computer world
public boolean equals(Child child) {
  return this.firstName.equals(child.getFirstName()) && this.lastName.equals(child.getLastName());
}

public static void main(String[] args) {
  Child c1 = new Child("Leo","Chan");

  // approach 1
  if (c1.getFirstName().equals("Leo") && c1.getLastName().equals("Chan")) {
    System.out.println("He is Leo Chan.");
  }

  // approach 2 // only check the firstname, so below is true
  System.out.println(c1.equals(new Child("Leo", "Chan"))); // true
  System.out.println(c1.equals(new Child("Leo", "Lau"))); // false
  System.out.println(c1.equals(new Child("Peter", "Lau"))); // false
  System.out.println(c1.equals(new Child("Peter", "Chan"))); // false

  Child c2 = new Child("Leo", "Wong");
  System.out.println(c2.getId()); //6
  System.out.println(c2.equals(new Child("Leo","Wong")));

}

}




